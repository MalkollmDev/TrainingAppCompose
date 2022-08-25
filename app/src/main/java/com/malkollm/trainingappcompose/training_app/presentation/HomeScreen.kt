package com.malkollm.trainingappcompose.training_app.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.malkollm.trainingappcompose.training_app.presentation.components.TrainingHistory
import com.malkollm.trainingappcompose.training_app.presentation.components.ChartPushUp
import com.malkollm.trainingappcompose.training_app.presentation.components.GeneralStatistics

@Composable
fun HomeScreen() {
    val trainingCounts = listOf(50, 57, 60, 75, 80)

    Column(modifier = Modifier.fillMaxSize()) {
        ChartPushUp(trainingCounts)
        GeneralStatistics(trainingCounts)
        TrainingHistory()
    }
}
