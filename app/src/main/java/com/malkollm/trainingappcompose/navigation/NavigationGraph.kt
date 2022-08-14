package com.malkollm.trainingappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.malkollm.trainingappcompose.ListScreen
import com.malkollm.trainingappcompose.PushScreen
import com.malkollm.trainingappcompose.SearchScreen
import com.malkollm.trainingappcompose.components.HomeScreen
import com.malkollm.trainingappcompose.components.statistics.TrainingStatistic

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItem.Workout.screen_route) {
            PushScreen()
        }
        composable(BottomNavItem.Statistic.screen_route) {
            SearchScreen()
        }
    }
}