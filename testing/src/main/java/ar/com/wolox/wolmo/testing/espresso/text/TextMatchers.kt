package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

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
