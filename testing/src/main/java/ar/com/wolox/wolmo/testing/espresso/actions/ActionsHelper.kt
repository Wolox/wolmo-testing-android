package ar.com.wolox.wolmo.testing.espresso.actions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.doubleClick
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.withId

fun scrollAndClick(vararg viewIds: Int) {
    viewIds.forEach {
        onView(withId(it)).perform(scrollTo(), click())
    }
}

fun scrollAndDoubleClick(vararg viewIds: Int) {
    viewIds.forEach {
        onView(withId(it)).perform(scrollTo(), doubleClick())
    }
}

fun scrollAndLongClick(vararg viewIds: Int) {
    viewIds.forEach {
        onView(withId(it)).perform(scrollTo(), longClick())
    }
}
