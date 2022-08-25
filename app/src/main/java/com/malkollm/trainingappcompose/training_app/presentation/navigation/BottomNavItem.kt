package com.malkollm.trainingappcompose.training_app.presentation.navigation

import com.malkollm.trainingappcompose.R

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {

    object Home : BottomNavItem("Home", R.drawable.ic_home, "home")
    object Workout : BottomNavItem("Workout", R.drawable.ic_workout, "workout")
    object Statistic : BottomNavItem("Statistic", R.drawable.ic_statistic, "statistic")
}