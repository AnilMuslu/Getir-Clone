package com.example.getirclone

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "firstScreen") {
        composable("firstScreen"){
            FirstScreen(navController = navController)
        }
        composable("getirHomePage"){
            GetirHomePage(navController = navController)
        }
        composable("snacksPage"){
            SnacksPage(navController = navController)
        }
        composable("getirWaterHomePage"){
            GetirWaterHomePage(navController = navController)
        }
        composable("profilePage"){
            ProfilePage(navController = navController)
        }
    }
}