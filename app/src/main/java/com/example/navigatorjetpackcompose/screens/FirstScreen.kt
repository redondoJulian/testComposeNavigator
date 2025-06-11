package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {navController.navigate("contact/Star")},
                //shape = CircleShape,
                containerColor = Color.Black,
                contentColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "Star",
                    tint = Color.White
                )
            }
        },
        topBar = {
            TopAppBar(
                title = { Text(text = "Primera página", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black
                ),
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = Color.LightGray)
                .fillMaxSize()
        ) {
            Column(modifier = Modifier.padding(vertical = 16.dp)) {
                CardText("Julián", navController)
                CardText("Jesica", navController)
                CardText("Jesus", navController)
                CardText("Kuki", navController)
                CardText("Kuka", navController)
            }
        }
    }
}

@Composable
fun CardText(name: String, navController: NavHostController){
    Box(modifier = Modifier.padding(vertical = 10.dp)){
        Text(
            text = name,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clickable{
                    navController.navigate("contact/$name")
                }
                .background(Color.Magenta)
                .fillMaxWidth()
                .padding(16.dp),
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )
    }
}