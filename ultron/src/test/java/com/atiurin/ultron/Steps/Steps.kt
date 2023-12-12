package com.atiurin.sampleapp.mySteps

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.helper.getText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.myPages.PagesMatchers
import com.atiurin.sampleapp.myPages.PagesMatchers.buttonInCustomClicks
import com.atiurin.sampleapp.myPages.PagesMatchers.circles
import com.atiurin.sampleapp.myPages.PagesMatchers.currentPersonsName
import com.atiurin.sampleapp.myPages.PagesMatchers.defaultInputTab
import com.atiurin.sampleapp.myPages.PagesMatchers.inputTextMatcher
import com.atiurin.sampleapp.myPages.PagesMatchers.menuBtn
import com.atiurin.sampleapp.myPages.PagesMatchers.menuItems
import com.atiurin.sampleapp.myPages.PagesMatchers.sendBtn
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.junit.Assert

object Steps {
    fun openChatUsingFriendName(name: String): Steps {
        val nameMatcher: Matcher<View> = allOf(PagesMatchers.chatMembers, withText(name))
        onView(nameMatcher).tap(5)

        return this
    }
    fun assertingCorrectChatWasOpened(name: String): Steps {
        Assert.assertEquals(name, currentPersonsName.getText())

        return this
    }
    fun assertingCustomsClickOpen(): Steps {
        buttonInCustomClicks.isViewDisplayed()

        return this
    }
    fun assertingTheMessageTabIsEmpty(): Steps {
        defaultInputTab.isViewDisplayed()

        return this
    }
    fun inputText(text: String): Steps {
        inputTextMatcher.typeText(text)
        sendBtn.tap(5)

        return this
    }
    fun openMenu(): Steps {
        menuBtn.tap(5)

        return this
    }
    fun tapMenuItemUsingText(text: String): Steps {
        val chosenItem: Matcher<View> = allOf(PagesMatchers.menuItems, withText(text))
        onView(chosenItem).tap(5)

        return this
    }

    fun clickOnAllTheCirclesManualWay(): Steps {
        for (circle in circles) {
            circle.tap(6)
        }
        return this
    }
    fun validateCirclesArePressed(): Steps {
        for (circle in circles) {
            onView(circle).check(matches(isChecked()))
        }
        return this
    }

//    fun clickOnTheCircles(){
//        var i = 1
//        while (true){
//            try {
//                val singularCircle: Matcher<View> = allOf(customClicksCircles, withIndex(i));
//                onView(singularCircle).perform(click())
//
//                i++
//            }catch (e: Exception){
//                break
//            }
//        }
//    }
}