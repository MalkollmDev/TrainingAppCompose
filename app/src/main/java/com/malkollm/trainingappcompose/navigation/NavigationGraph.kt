package com.malkollm.trainingappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.malkollm.trainingappcompose.components.CurrentTrainingScreen
import com.malkollm.trainingappcompose.components.WorkoutScreen
import com.malkollm.trainingappcompose.components.HomeScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItem.Workout.screen_route) {
            WorkoutScreen()
        }
        composable(BottomNavItem.Statistic.screen_route) {
            CurrentTrainingScreen()
        }
    }
}