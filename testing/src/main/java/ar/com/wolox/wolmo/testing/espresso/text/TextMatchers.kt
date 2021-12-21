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

    /**
     * This method checks if the text of the given view contains the expected text.
     *
     * @param assertion one of more pairs consisting of a ViewId (Int) and an expected string.
     * @see Assertion
     * <pre>{@code
     * checkTextMatches(
     *     Assertion(R.id.myButton, getString(R.string.my_string)),
     *     Assertion(R.id.myLabel, getString(R.string.my_label))
     * )}
     * </pre>
     */
    fun checkTextMatches(vararg assertion: Assertion) {
        assertion.forEach {
            onView(withId(it.viewId)).check(matches(withText(it.expectedString)))
        }
    }

    /**
     * This method checks if the hint of the given view contains the expected text.
     *
     * @param assertion one of more pairs consisting of a ViewId (Int) and an expected string.
     * @see Assertion
     * <pre>{@code
     * checkHintMatches(
     *     Assertion(R.id.myEditText, getString(R.string.my_hint))
     * )}
     * </pre>
     */
    fun checkHintMatches(vararg assertion: Assertion) {
        assertion.forEach {
            onView(withId(it.viewId)).check(matches(withHint(it.expectedString)))
        }
    }

    /**
     * This method checks if the error text of the given view contains the expected text.
     *
     * @param assertion one of more pairs consisting of a ViewId (Int) and an expected string.
     * @see Assertion
     * <pre>{@code
     * checkErrorText(
     *     Assertion(R.id.myEditText, getString(R.string.my_error_string))
     * )}
     * </pre>
     */
    fun checkErrorText(vararg assertion: Assertion) {
        assertion.forEach {
            onView(withId(it.viewId)).check(matches(hasErrorText(it.expectedString)))
        }
    }

    /**
     * This method checks if the text of any popup view (like a Toast or a SnackBar) contains the expected text.
     *
     * @param stringResId one or more expected string IDs.
     * <pre>{@code
     * checkTextMatches(
     *     R.string.my_toast_text,
     *     R.string.my_snackbar_text
     * )}
     * </pre>
     */
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
