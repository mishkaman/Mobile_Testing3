package com.atiurin.sampleapp.mySteps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.helper.getText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.myPages.CertainChatPage
import com.atiurin.sampleapp.myPages.CertainChatPage.everyTextSent
import org.hamcrest.Matchers.allOf
import org.junit.Assert

object CertainChatSteps {
    fun assertingCorrectChatWasOpened(name: String): CertainChatSteps {
        Assert.assertEquals(name, CertainChatPage.currentPersonsName.getText())

        return this
    }
    fun assertingTheMessageTabIsEmpty(): CertainChatSteps {
        CertainChatPage.defaultInputTab.isViewDisplayed()

        return this
    }
    fun inputText(text: String): CertainChatSteps {
        CertainChatPage.inputTextMatcher.typeText(text)
        CertainChatPage.sendBtn.tap(5)

        return this
    }
    fun assertingAMessageInChat(text: String) {
        onView(allOf(withText(text), isDisplayed(), everyTextSent)).check(matches(isDisplayed()))
    }

}