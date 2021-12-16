package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId

object TextHelpers {
    fun writeText(vararg text: Pair<Int, String>) {
        text.forEach {
            onView(withId(it.first)).perform(typeText(it.second), closeSoftKeyboard())
        }
    }
}
