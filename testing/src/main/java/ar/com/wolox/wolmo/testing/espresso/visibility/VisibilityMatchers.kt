package ar.com.wolox.wolmo.testing.espresso.visibility

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId

object VisibilityMatchers {
    fun checkIsVisible(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it))
                .check(
                    matches(
                        withEffectiveVisibility(
                            ViewMatchers.Visibility.VISIBLE
                        )
                    )
                )
        }
    }

    fun checkIsGone(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(
                matches(
                    withEffectiveVisibility(
                        ViewMatchers.Visibility.GONE
                    )
                )
            )
        }
    }

    fun checkIsInvisible(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(
                matches(
                    withEffectiveVisibility(
                        ViewMatchers.Visibility.INVISIBLE
                    )
                )
            )
        }
    }

    fun checkIsEnabled(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isEnabled()))
        }
    }

    fun checkIsDisabled(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isNotEnabled()))
        }
    }
}
