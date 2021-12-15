package ar.com.wolox.wolmo.testing.espresso.visibility

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers

fun checkIsDisplayed(vararg viewIds: Int) {
    viewIds.forEach {
        Espresso.onView(ViewMatchers.withId(it))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
