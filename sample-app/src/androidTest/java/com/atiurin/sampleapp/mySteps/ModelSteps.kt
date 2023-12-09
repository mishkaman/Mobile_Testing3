package com.atiurin.sampleapp.mySteps

import android.view.View
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import org.hamcrest.Matcher

object ModelSteps {
    fun assertingElemntisOnScreen(element : Matcher<View>): ModelSteps{
        Thread.sleep(2000)
        element.isViewDisplayed()

        return this
    }
    fun tapAnElement(element: Matcher<View>): ModelSteps{
        element.tap(5)

        return this
    }
}