package com.atiurin.sampleapp.myTests
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.myData.Data.basicText
import com.atiurin.sampleapp.myData.Data.chandlerName
import com.atiurin.sampleapp.myData.Data.customClicksBtnText
import com.atiurin.sampleapp.myData.Data.validatePageUsingText
import com.atiurin.sampleapp.mySteps.Steps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class Test {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun tC1TalkingToChandler() {
        with(Steps) {
            isTextOnScreen(validatePageUsingText)
            openChatUsingFriendName(chandlerName)
                .assertingCorrectChatWasOpened(chandlerName)
                .inputText(basicText)
                .assertingTheMessageTabIsEmpty()
        }
    }

    @Test
    fun tC2TestingCustomClicks() {
        with(Steps) {
            isTextOnScreen(validatePageUsingText)
            openMenu().tapMenuItemUsingText(customClicksBtnText)
                .assertingCustomsClickOpen()
                .clickOnAllTheCirclesManualWay()
                .validateCirclesArePressed()
        }
    }
}