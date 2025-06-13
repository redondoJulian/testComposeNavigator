package com.example.navigatorjetpackcompose.screens

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigatorjetpackcompose.Screens

@Composable
fun NavController() {
    val navController = rememberNavController()
    val animationVel = 300
    NavHost(
        navController = navController,
        startDestination = "initialScreen"
    ) {
        composable(route = Screens.Initial.screen) { InitialScreen(navController) }

        //Up
        composable(
            route = Screens.Up.screen,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(animationVel)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(animationVel)
                )
            }
        ) { DirectionalScreen(navController, Color.Blue, "Up / Go back") }

        //Down
        composable(
            route = Screens.Down.screen,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(animationVel)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(animationVel)
                )
            }
        ) { DirectionalScreen(navController, Color.Green, "Down / Go back") }

        //Left
        composable(
            route = Screens.Left.screen,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(animationVel)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(animationVel)
                )
            }
            ) { DirectionalScreen(navController, Color.Red, "Left / Go back") }

        //Right
        composable(
            route = Screens.Right.screen,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(animationVel)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(animationVel)
                )
            }
            ) { DirectionalScreen(navController, Color.Yellow, "Right / Go back") }
    }
}