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
    fun checkIntent(className: String, action: () -> Unit) {
        Intents.init()
        action()
        intended(hasComponent(className))
        Intents.release()
    }

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
