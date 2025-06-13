package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigatorjetpackcompose.Screens


@Composable
fun InitialScreen(navController: NavHostController) {
    Scaffold { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.LightGray)
                .fillMaxSize()
        ) {
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Gray)){
                IconButton( //Arriba
                    modifier = Modifier.align(Alignment.TopCenter),
                    onClick = {navController.navigate(Screens.up.screen)}){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Up",
                        tint = Color.White,
                    )
                }
                IconButton( //Abajo
                    modifier = Modifier.align(Alignment.BottomCenter),
                    onClick = {navController.navigate(Screens.down.screen)}){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Down",
                        tint = Color.White,
                    )
                }
                IconButton( //Izquierda
                    modifier = Modifier.align(Alignment.CenterStart),
                    onClick = {navController.navigate(Screens.left.screen)}){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Left",
                        tint = Color.White,
                    )
                }
                IconButton( //Derecha
                    modifier = Modifier.align(Alignment.CenterEnd),
                    onClick = {navController.navigate(Screens.right.screen)}){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Right",
                        tint = Color.White,
                    )
                }
            }
        }

    }
}