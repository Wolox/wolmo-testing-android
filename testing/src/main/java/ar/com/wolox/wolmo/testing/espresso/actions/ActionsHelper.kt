package ar.com.wolox.wolmo.testing.espresso.actions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.withId

object ActionsHelper {

    /**
     * Use this method to scroll to a certain view and then perform a ViewAction on it.
     *
     * @param viewId the ID of the view you want to perform the action.
     * @param action the ViewAction you want to perform.
     * @see ViewAction
     * <pre>{@code
     * scrollAndPerformAction(R.id.myButton, click())}
     * </pre>
     */
    fun scrollAndPerformAction(viewId: Int, action: ViewAction) {
         onView(withId(viewId)).perform(scrollTo(), action)
    }

    /**
     * Use this method to click a view.
     *
     * @param viewId the ID of the view you want to click.
     * <pre>{@code
     * singleClick(R.id.myButton)
     * }
     * </pre>
     */
    fun singleClick(vararg viewId: Int) {
        viewId.forEach {
            onView(withId(it)).perform(click())
        }
    }
}
