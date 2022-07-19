package com.nando.boilerplate2022.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nando.boilerplate2022.presentation.login.LoginScreen
import com.nando.boilerplate2022.presentation.splash.AnimatedSplashScreen

@Composable
fun setupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(
            route = Screen.SplashScreen.route
        ) {
            AnimatedSplashScreen(navController)
        }
        composable(
            route = Screen.LoginScreen.route
        ) {
            LoginScreen()
        }
        composable(
            route = Screen.CoinListScreen.route
        ) {

        }
        composable(
            route = Screen.CoinDetailScreen.route
        ) {

        }
    }
}
