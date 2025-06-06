package com.example.navigatorjetpackcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstPage(navController: NavHostController, contador: Int) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Kikita hermosauwu") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("second") }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Otra página"
                        )
                    }
                })
        }
    ) { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Text(
                text = "Cantidad de estrellas: $contador",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}