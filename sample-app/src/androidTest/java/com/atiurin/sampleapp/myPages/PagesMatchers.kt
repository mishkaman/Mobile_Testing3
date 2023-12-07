package com.atiurin.sampleapp.myPages

import android.view.View
import androidx.compose.material.icons.extended.R
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object PagesMatchers {
    val chatMembers: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.tv_name)) }
    val inputTextMatcher: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.message_input_text)) }
    val sendBtn: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.send_button)) }
    val menuBtn: Matcher<View> by lazy { allOf(withContentDescription("Open navigation drawer")) }
    val menuItems: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.design_menu_item_text)) }
    val currentPersonsName: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.toolbar_title)) }
    val defaultInputTab: Matcher<View> by lazy {
        allOf(
            withId(com.atiurin.sampleapp.R.id.message_input_text),
            ViewMatchers.withText("Enter text")
        )
    }
    val buttonInCustomClicks: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.button)) }

//    val customClicksCircles: Matcher<View> by lazy { allOf(withClassName(Matchers.`is`("android.widget.RadioButton"))) }
    val customClicksCircle1: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_top_left)) }
    val customClicksCircle2: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_top_center)) }
    val customClicksCircle3: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_top_right)) }
    val customClicksCircle4: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_center_left)) }
    val customClicksCircle5: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_center_right)) }
    val customClicksCircle6: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_bottom_left)) }
    val customClicksCircle7: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_bottom_center)) }
    val customClicksCircle8: Matcher<View> by lazy { allOf(withId(com.atiurin.sampleapp.R.id.rB_bottom_right)) }

    val circles = listOf(
        customClicksCircle1,
        customClicksCircle2,
        customClicksCircle3,
        customClicksCircle4,
        customClicksCircle5,
        customClicksCircle6,
        customClicksCircle7,
        customClicksCircle8
    )
}
