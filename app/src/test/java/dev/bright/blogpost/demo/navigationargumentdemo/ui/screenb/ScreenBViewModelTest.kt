package dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb

import org.junit.Assert.*
import org.junit.Test

class ScreenBViewModelTest {
    @Test
    fun screen_B_view_model_saves_argument_correctly() {
        val greetingNameArg = "Bob"
        val vm = ScreenBViewModel(greetingNameArg)
        assertEquals(greetingNameArg, vm.uiState.value.greetingName)
    }
}