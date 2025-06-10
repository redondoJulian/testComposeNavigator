package com.example.navigatorjetpackcompose.old

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val velocityDur = 400
            NavHost(
                navController = navController,
                startDestination = "first",
                enterTransition = {
                    slideIntoContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.Start,
                        animationSpec = tween(velocityDur)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.Start,
                        animationSpec = tween(velocityDur)
                    )
                },
                popEnterTransition = {
                    slideIntoContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.End,
                        animationSpec = tween(velocityDur)
                    )
                },
                popExitTransition = {
                    slideOutOfContainer(
                        towards = AnimatedContentTransitionScope.SlideDirection.End,
                        animationSpec = tween(velocityDur)
                    )
                }
            ) {
                composable(route = "first") { FirstScreen(navController) }
                //composable(route = "contact") { ContactScreen(navController) }
                composable(
                    route = "contact/{name}",
                    arguments = listOf(navArgument("name") {
                        type = NavType.StringType
                    })
                ) { navBackStackEntry ->
                    val name = navBackStackEntry.arguments?.getString("name")

                }
            }
        }
    }
}