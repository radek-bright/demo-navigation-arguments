package dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ScreenBViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val greetingNameArgument = savedStateHandle.get<String>("greetingName")
    private val _uiState = MutableStateFlow(UiState(greetingName = greetingNameArgument ?: ""))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    data class UiState(
        val greetingName: String,
    )
}