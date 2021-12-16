package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

object TextMatchers {
    fun checkTextMatches(vararg match: Pair<Int, String>) {
        match.forEach {
            onView(withId(it.first)).check(matches(withText(it.second)))
        }
    }

    fun checkHintMatches(vararg match: Pair<Int, String>) {
        match.forEach {
            onView(withId(it.first)).check(matches(withHint(it.second)))
        }
    }

    fun checkErrorText(vararg match: Pair<Int, String>) {
        match.forEach {
            onView(withId(it.first)).check(matches(hasErrorText(it.second)))
        }
    }

    fun checkPopUpText(vararg stringResId: Int) {
        stringResId.forEach {
            onView(withText(it)).check(
                matches(
                    ViewMatchers.withEffectiveVisibility(
                        ViewMatchers.Visibility.VISIBLE
                    )
                )
            )
        }
    }
}
