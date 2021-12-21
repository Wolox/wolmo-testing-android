package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import ar.com.wolox.wolmo.testing.model.Assertion

object TextHelpers {
    /**
     * Use this method to type text inside an EditText and closing the soft keyboar.d
     *
     * @param viewId the ID of the view in which the text will be typed.
     * @param text the text to be typed
     * <pre>{@code
     * writeText(R.id.myEditText, R.id.my_text)
     * }
     * </pre>
     */
    fun writeText(viewId: Int, text: String) {
        onView(withId(viewId)).perform(typeText(text), closeSoftKeyboard())
    }
}
