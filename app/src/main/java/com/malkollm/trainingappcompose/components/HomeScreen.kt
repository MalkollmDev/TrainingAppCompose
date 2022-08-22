package com.malkollm.trainingappcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.malkollm.trainingappcompose.components.statistics.TrainingHistory
import com.malkollm.trainingappcompose.components.statistics.ChartPushUp
import com.malkollm.trainingappcompose.components.statistics.GeneralStatistics

@Composable
fun HomeScreen() {
    val trainingCounts = listOf(50, 57, 60, 75, 80)

    Column(modifier = Modifier.fillMaxSize()) {
        ChartPushUp(trainingCounts)
        GeneralStatistics(trainingCounts)
        TrainingHistory()
    }
}
