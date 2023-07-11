package dev.bright.blogpost.demo.navigationargumentdemo.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.bright.blogpost.demo.navigationargumentdemo.ui.screena.ScreenA
import dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb.ScreenB

@Composable
fun RootNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "ScreenA",
    ) {
        composable(route = "ScreenA") {
            ScreenA(viewModel()) { greetingNameArg ->
                navController.navigate("ScreenB?greetingName=$greetingNameArg")
            }
        }

        composable(
            route = "ScreenB?greetingName={greetingName}",
            arguments = listOf(
                navArgument("greetingName") { type = NavType.StringType },
            ),
        ) {
            ScreenB(viewModel())
        }
    }
}