package com.atiurin.sampleapp.myTests
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.myData.Data.EmmaName
import com.atiurin.sampleapp.myData.Data.drinkingInvitation
import com.atiurin.sampleapp.myData.Data.friend17
import com.atiurin.sampleapp.myData.Data.renameRequest
import com.atiurin.sampleapp.myData.Data.validatePageUsingText
import com.atiurin.sampleapp.myPages.MainChatLog.UiElementsBtn
import com.atiurin.sampleapp.myPages.UiElementsPage.EnableBtn
import com.atiurin.sampleapp.myPages.UiElementsPage.clickableBtn
import com.atiurin.sampleapp.myPages.UiElementsPage.invisibleBtn
import com.atiurin.sampleapp.myPages.UiElementsPage.simpleBtn
import com.atiurin.sampleapp.mySteps.CertainChatSteps
import com.atiurin.sampleapp.mySteps.MainChatSteps
import com.atiurin.sampleapp.mySteps.ModelSteps
import com.atiurin.sampleapp.mySteps.UiElementsSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun tc1Swiper() {
        MainChatSteps
            .findAnyFriend(EmmaName)
            .openChatUsingFriendName(EmmaName)
        CertainChatSteps
            .assertingCorrectChatWasOpened(EmmaName)
            .inputText(drinkingInvitation)
            .assertingTheMessageTabIsEmpty()
            .assertingAMessageInChat(drinkingInvitation)


    }

    @Test
    fun tc2S() {
        MainChatSteps
            .findAnyFriend(friend17)
            .openChatUsingFriendName(friend17)
        CertainChatSteps
            .assertingCorrectChatWasOpened(friend17)
            .inputText(renameRequest)
            .assertingTheMessageTabIsEmpty()
            .assertingAMessageInChat(renameRequest)
    }

    @Test
    fun tc3() {
            isTextOnScreen(validatePageUsingText)
        MainChatSteps
            .openMenu()
            .tapMenuItemUsingText("UiElements")
        ModelSteps
                .assertingElemntisOnScreen(UiElementsBtn)
                .tapAnElement(EnableBtn)
                .tapAnElement(clickableBtn)
        UiElementsSteps
                .assertThatAnElementIsUnchecked(EnableBtn)
                .assertThatAnElementIsUnchecked(clickableBtn)
        ModelSteps
                .tapAnElement(invisibleBtn)
        UiElementsSteps
                 .assertingElementInvisible(simpleBtn)

    }
}