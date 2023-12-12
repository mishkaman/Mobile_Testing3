package com.atiurin.sampleapp.myPages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object UiElementsPage {
    val EnableBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.checkbox_enable)) }
    val clickableBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.checkbox_clickable)) }
    val invisibleBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.radio_invisible)) }
    val simpleBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.button1)) }
}