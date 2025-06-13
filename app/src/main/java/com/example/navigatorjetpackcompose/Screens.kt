package com.example.navigatorjetpackcompose

sealed class Screens(val screen: String) {
    object Initial : Screens("initialScreen")
    object Up : Screens("up")
    object Down : Screens("down")
    object Left : Screens("left")
    object Right : Screens("right")

}