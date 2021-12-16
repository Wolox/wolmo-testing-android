package ar.com.wolox.wolmo.testing.espresso.intents

import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent

fun checkIntent(className: String) {
    Intents.init()
    intended(hasComponent(className))
    Intents.release()
}
