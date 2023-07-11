package dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ScreenBViewModel @Inject constructor(
    @GreetingNameNavArg private val greetingNameArgument: String,
) : ViewModel() {

    private val _uiState = MutableStateFlow(UiState(greetingName = greetingNameArgument))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    data class UiState(
        val greetingName: String,
    )
}