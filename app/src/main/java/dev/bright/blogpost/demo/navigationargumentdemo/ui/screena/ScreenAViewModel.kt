package dev.bright.blogpost.demo.navigationargumentdemo.ui.screena

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ScreenAViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun onNameInputChange(value: String) {
        _uiState.update {
            it.copy(nameInput = value)
        }
    }

    data class UiState(
        val nameInput: String = "",
    )
}