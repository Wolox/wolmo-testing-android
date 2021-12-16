package ar.com.wolox.wolmo.testing.hilt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.core.internal.deps.dagger.internal.Preconditions
import ar.com.wolox.wolmo.testing.R

inline fun <reified T : Fragment> launchFragment(
    fragmentArgs: Bundle? = null,
    crossinline action: Fragment.() -> Unit = {}
): T {
    var fragment: Fragment? = null
    val startActivityIntent = Intent(
        ApplicationProvider.getApplicationContext(),
        HiltTestActivity::class.java
    ).putExtra(
        "androidx.fragment.app.testing.FragmentScenario.EmptyFragmentActivity.THEME_EXTRAS_BUNDLE_KEY",
        R.style.EmptyFragmentActivityTheme
    )
    Log.i("Wolmo Testing", "Starting dummy activity for fragment: ${T::class.java.name}")

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
    return (fragment as T?)!!
}
