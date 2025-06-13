package com.example.navigatorjetpackcompose

sealed class Screens(val screen: String) {
    object initial : Screens("initialScreen")
    object up : Screens("up")
    object down : Screens("down")
    object left : Screens("left")
    object right : Screens("right")

}