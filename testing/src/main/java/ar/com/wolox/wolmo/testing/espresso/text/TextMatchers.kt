package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import ar.com.wolox.wolmo.testing.model.Assertion

object TextMatchers {
    fun checkTextMatches(vararg match: Assertion) {
        match.forEach {
            onView(withId(it.viewId)).check(matches(withText(it.expectedString)))
        }
    }

    fun checkHintMatches(vararg match: Assertion) {
        match.forEach {
            onView(withId(it.viewId)).check(matches(withHint(it.expectedString)))
        }
    }

    fun checkErrorText(vararg match: Assertion) {
        match.forEach {
            onView(withId(it.viewId)).check(matches(hasErrorText(it.expectedString)))
        }
    }

    fun checkPopUpText(vararg stringResId: Int) {
        stringResId.forEach {
            onView(withText(it)).check(
                matches(
                    withEffectiveVisibility(
                        ViewMatchers.Visibility.VISIBLE
                    )
                )
            )
        }
    }
}
