package dev.bright.blogpost.demo.navigationargumentdemo.ui.screena

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import dev.bright.blogpost.demo.navigationargumentdemo.ui.theme.NavigationArgumentDemoTheme
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenA(vm: ScreenAViewModel, onNavigateNext: (String) -> Unit) {

    val uiState by vm.uiState.collectAsState()

    NavigationArgumentDemoTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp)
        ) {
            Text(text = "What's your name?")

            TextField(
                modifier = Modifier.padding(top = 24.dp),
                value = uiState.nameInput,
                onValueChange = vm::onNameInputChange,
            )

            Button(
                modifier = Modifier.padding(top = 24.dp),
                onClick = {
                    onNavigateNext(uiState.nameInput)
                },
            ) {
                Text(text = "Next")
            }
        }
    }
}

