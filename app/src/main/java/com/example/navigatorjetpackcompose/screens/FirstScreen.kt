package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
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
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Gray)
            ) {
                IconButton( //Up
                    modifier = Modifier.align(Alignment.TopCenter),
                    onClick = { navController.navigate(Screens.Up.screen) }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Up",
                        tint = Color.White,
                    )
                }
                IconButton( //Down
                    modifier = Modifier.align(Alignment.BottomCenter),
                    onClick = { navController.navigate(Screens.Down.screen) }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Down",
                        tint = Color.White,
                    )
                }
                IconButton( //Left
                    modifier = Modifier.align(Alignment.CenterStart),
                    onClick = { navController.navigate(Screens.Left.screen) }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Left",
                        tint = Color.White,
                        modifier = Modifier.rotate(270f)
                    )
                }
                IconButton( //Right
                    modifier = Modifier.align(Alignment.CenterEnd),
                    onClick = { navController.navigate(Screens.Right.screen) }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Right",
                        tint = Color.White,
                        modifier = Modifier.rotate(90f)
                    )
                }
            }
        }

    }
}