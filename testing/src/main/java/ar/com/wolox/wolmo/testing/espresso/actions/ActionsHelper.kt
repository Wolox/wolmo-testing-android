package ar.com.wolox.wolmo.testing.espresso.actions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.withId

object ActionsHelper {
    fun scrollAndPerformAction(vararg viewId: Int, action: ViewAction) {
        viewId.forEach {
            onView(withId(it)).perform(scrollTo(), action)
        }
    }

    fun singleClick(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).perform(click())
        }
    }
}
