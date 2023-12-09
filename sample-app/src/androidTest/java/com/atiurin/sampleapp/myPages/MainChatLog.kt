package com.atiurin.sampleapp.myPages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainChatLog {
    val chatMembers: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.tv_name)) }
    val menuBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withContentDescription("Open navigation drawer")) }
    val menuItems: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.design_menu_item_text)) }
    val UiElementsBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.button1)) }
}