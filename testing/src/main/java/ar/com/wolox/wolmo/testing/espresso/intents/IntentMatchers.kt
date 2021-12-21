package ar.com.wolox.wolmo.testing.espresso.intents

import android.app.Instrumentation
import android.content.Intent
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.matcher.IntentMatchers.hasData
import org.hamcrest.Matchers

object IntentMatchers {

    /**
     * This method checks if an Intent with the given class name is found.
     *
     * @param className the name of the class expected to be instantiated.
     * @param action any action you need to do to launch that class.
     * @see Intent
     * <pre>{@code
     * checkIntent(NewActivity::class.java.name) {
     *     singleClick(R.id.startNewActivityButton)
     * }
     * }
     * </pre>
     */
    fun checkIntent(className: String, action: () -> Unit) {
        Intents.init()
        action()
        intended(hasComponent(className))
        Intents.release()
    }

    /**
     * This method checks if an ACTION_VIEW Intent with the given URI is found.
     *
     * @param uri the expected URI (e.g. an URL)
     * @param action any action you need to do to launch that Intent.
     * @see Intent
     * @see Intent.ACTION_VIEW
     * <pre>{@code
     * checkIntentWithActionView("https://www.google.com") {
     *     singleClick(R.id.startBrowserButton)
     * }
     * }
     * </pre>
     */
    fun checkIntentWithActionView(uri: String, action: () -> Unit) {
        Intents.init()
        val intent = Matchers.allOf(
            IntentMatchers.hasAction(Intent.ACTION_VIEW),
            hasData(uri)
        )
        Intents.intending(intent).respondWith(Instrumentation.ActivityResult(0, null))
        action()
        intended(intent)
        Intents.release()
    }
}
