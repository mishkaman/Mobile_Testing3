package com.atiurin.sampleapp.mySteps

import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.myPages.MainChatLog
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainChatSteps {
    fun openChatUsingFriendName(name: String): MainChatSteps {
        val nameMatcher: Matcher<View> =
            Matchers.allOf(MainChatLog.chatMembers, ViewMatchers.withText(name))
        Espresso.onView(nameMatcher).tap(5)

        return this
    }
    fun openMenu(): MainChatSteps {
        MainChatLog.menuBtn.tap(5)

        return this
    }
    fun tapMenuItemUsingText(text: String): MainChatSteps {
        val chosenItem: Matcher<View> =
            Matchers.allOf(MainChatLog.menuItems, ViewMatchers.withText(text))
        Espresso.onView(chosenItem).tap(5)

        return this
    }
    fun findAnyFriend(friendName: String): MainChatSteps{
        val nameMatcher1: Matcher<View> =
            Matchers.allOf(MainChatLog.chatMembers, ViewMatchers.withText(friendName))

        while(!nameMatcher1.isViewDisplayed()){
            scrollOnce()
        }
        return this
    }

    private fun scrollOnce(){
        swiper(400, 250, 10)
    }
}