package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import ar.com.wolox.wolmo.testing.model.Assertion

object TextHelpers {
    fun writeText(vararg text: Assertion) {
        text.forEach {
            onView(withId(it.viewId)).perform(typeText(it.expectedString), closeSoftKeyboard())
        }
    }
}
