package ar.com.wolox.wolmo.testing.espresso.intents

import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent

object IntentMatchers {
    fun checkIntent(className: String, action: () -> Unit) {
        Intents.init()
        action()
        intended(hasComponent(className))
        Intents.release()
    }
}
