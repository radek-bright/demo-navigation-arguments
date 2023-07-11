package dev.bright.blogpost.demo.navigationargumentdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dev.bright.blogpost.demo.navigationargumentdemo.navigation.RootNavigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootNavigation()
        }
    }
}