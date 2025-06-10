package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController: NavHostController, nameArgument: String?){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Primer página", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black
                ),
                navigationIcon = {
                    IconButton(
                        onClick = {navController.popBackStack()}
                    ) { Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Segunda página",
                        tint = Color.White
                        ) }
                }
            )
        }
    ) {
        innerPadding ->
        Box(

            modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Color.LightGray),

        ){
            Text(
                text = "Hola $nameArgument",
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,
                modifier = Modifier
                    .background(Color.Gray)
                    .clickable{

                    }
                    .padding(horizontal = 24.dp, vertical = 34.dp)
                    .fillMaxWidth()
            )
        }
    }
}