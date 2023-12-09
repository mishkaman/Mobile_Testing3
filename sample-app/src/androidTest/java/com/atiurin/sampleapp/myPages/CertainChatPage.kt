package com.atiurin.sampleapp.myPages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object CertainChatPage {
    val inputTextMatcher: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.message_input_text)) }
    val sendBtn: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.send_button)) }
    val currentPersonsName: Matcher<View> by lazy { Matchers.allOf(ViewMatchers.withId(R.id.toolbar_title)) }
    val defaultInputTab: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.message_input_text),
            ViewMatchers.withText("Enter text")
        )
    }
    val everyTextSent: Matcher<View> by lazy { Matchers.allOf(withId(R.id.message_text))}

}