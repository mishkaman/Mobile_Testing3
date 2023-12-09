package com.atiurin.sampleapp.mySteps

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import com.atiurin.ultron.extensions.isNotChecked
import org.hamcrest.Matcher


object UiElementsSteps {
    fun assertThatAnElementIsUnchecked(element: Matcher<View>): UiElementsSteps{
        element.isNotChecked()

        return this
    }
    fun assertingElementInvisible(element: Matcher<View>): UiElementsSteps {
    onView(element).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.INVISIBLE)))
        return this
    }
//    fun isDisplayed_BooleanTrue_ofInvisibleObject(element: Matcher<View>): UiElementsSteps {
//        val result = element.isSuccess { withTimeout(100).isDisplayed() }
//        Assert.assertTrue(result)
//
//        return this
//    }


}