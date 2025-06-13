package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun DirectionalScreen(navController: NavHostController, backgroundColor: Color, text: String) {
    Scaffold { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(innerPadding)
                .background(backgroundColor)
                .fillMaxSize()
        ) {
            Box(modifier = Modifier
                .size(width = 300.dp, height = 100.dp)
                .background(Color.White)){
                Text(
                    text = text,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clickable{
                            navController.popBackStack()
                        }
                        .background(Color.Black)
                        .padding(vertical = 16.dp, horizontal = 32.dp)
                        .align(alignment = Alignment.Center)
                )
            }
        }

    }
}