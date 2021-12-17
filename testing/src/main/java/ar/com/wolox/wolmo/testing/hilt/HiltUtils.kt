package ar.com.wolox.wolmo.testing.hilt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions
import ar.com.wolox.wolmo.testing.R
import ar.com.wolox.wolmo.testing.WolmoTestingConstants

inline fun <reified T : Fragment> launchHiltFragment(
    fragmentArgs: Bundle? = null,
    crossinline action: Fragment.() -> Unit = {}
): T? {
    return try {
        var fragment: Fragment? = null
        val startActivityIntent = Intent(
            ApplicationProvider.getApplicationContext(),
            HiltTestActivity::class.java
        ).putExtra(
            WolmoTestingConstants.THEME_EXTRAS_BUNDLE_KEY,
            R.style.EmptyFragmentActivityTheme
        )
        Log.i(
            WolmoTestingConstants.LIBRARY_NAME,
            "Starting Hilt container for fragment: ${T::class.java.name}"
        )

        ActivityScenario.launch<HiltTestActivity>(startActivityIntent).onActivity { activity ->
            fragment = activity.supportFragmentManager.fragmentFactory.instantiate(
                Preconditions.checkNotNull(T::class.java.classLoader),
                T::class.java.name
            )
            fragment?.let {
                it.arguments = fragmentArgs
                activity.supportFragmentManager
                    .beginTransaction()
                    .add(android.R.id.content, it, "")
                    .commitNow()

                it.action()
            }
        }
        (fragment as T?)
    } catch (e: Exception) {
        Log.e(WolmoTestingConstants.LIBRARY_NAME, e.message!!)
        null
    }
}
