package dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.bright.blogpost.demo.navigationargumentdemo.ui.theme.NavigationArgumentDemoTheme

@Composable
fun ScreenB(vm: ScreenBViewModel) {
    val uiState by vm.uiState.collectAsState()
    NavigationArgumentDemoTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            color = MaterialTheme.colorScheme.background,
        ) {
            Greeting(uiState.greetingName)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}
