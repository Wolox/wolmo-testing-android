package ar.com.wolox.wolmo.testing.espresso.text

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId

object TextHelpers {

    /**
     * Use this method to type text inside an EditText and closing the soft keyboard
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

    /**
     * Use this method to clear the current text inside an EditText.
     *
     * @param viewId the ID of the view in which the text will be typed.
     * <pre>{@code
     * clearText(R.id.myEditText)
     * }
     * </pre>
     */
    fun clearText(viewId: Int) {
        onView(withId(viewId)).perform(ViewActions.clearText())
    }

    /**
     * Use this method to replace the current text inside an EditText and closing the soft keyboard
     *
     * @param viewId the ID of the view in which the text will be typed.
     * @param text the new text to be typed
     * <pre>{@code
     * replaceText(R.id.myEditText, R.id.my_new_text)
     * }
     * </pre>
     */
    fun replaceText(viewId: Int, newText: String) {
        onView(withId(viewId)).perform(ViewActions.replaceText(newText), closeSoftKeyboard())
    }
}
