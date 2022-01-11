package ar.com.wolox.wolmo.testing.espresso.visibility

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import ar.com.wolox.wolmo.testing.model.Assertion

object VisibilityMatchers {

    /**
     * This method checks if the given views' visibility is set to Visibility.VISIBLE.
     *
     * @param viewId
     * <pre>{@code
     * checkIsVisible(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
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

    /**
     * This method checks if the given views' visibility is set to Visibility.GONE.
     *
     * @param viewId
     * <pre>{@code
     * checkIsGone(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
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

    /**
     * This method checks if the given views' visibility is set to Visibility.INVISIBLE.
     *
     * @param viewId
     * <pre>{@code
     * checkIsInvisible(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
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

    /**
     * This method checks if the given views are enabled.
     *
     * @param viewId
     * <pre>{@code
     * checkIsEnabled(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
    fun checkIsEnabled(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isEnabled()))
        }
    }

    /**
     * This method checks if the given views are disabled.
     *
     * @param viewId
     * <pre>{@code
     * checkIsDisabled(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
    fun checkIsDisabled(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isNotEnabled()))
        }
    }

    /**
     * This method checks if the given views are clickable.
     *
     * @param viewId
     * <pre>{@code
     * checkIsClickable(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
    fun checkIsClickable(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isClickable()))
        }
    }

    /**
     * This method checks if the given views are not clickable.
     *
     * @param viewId
     * <pre>{@code
     * checkIsNotClickable(R.id.myImageView, R.id.myTextView)
     * }
     * </pre>
     */
    fun checkIsNotClickable(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).check(matches(ViewMatchers.isNotClickable()))
        }
    }

    /**
     * This method checks if the given view has focus.
     *
     * @param viewId
     * <pre>{@code
     * checkIsFocused(R.id.myImageView)
     * }
     * </pre>
     */
    fun checkIsFocused(viewId: Int) {
        onView(withId(viewId)).check(matches(ViewMatchers.isFocused()))
    }

    /**
     * This method checks if the given view does not have focus.
     *
     * @param viewId
     * <pre>{@code
     * checkIsNotFocused(R.id.myImageView)
     * }
     * </pre>
     */
    fun checkIsNotFocused(viewId: Int) {
        onView(withId(viewId)).check(matches(ViewMatchers.isNotFocused()))
    }
}
