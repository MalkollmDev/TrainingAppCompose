package com.malkollm.trainingappcompose.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.malkollm.trainingappcompose.training_app.presentation.workout_details.WeekCard

@Composable
fun WorkoutScreen() {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Text(
            "План на 4 недели",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(6.dp)
                .fillMaxWidth()
        )
        WeekCard()
        WeekCard()
        WeekCard()
        WeekCard()
    }
}

@Preview
@Composable
fun WorkoutScreenPrev() {
    WorkoutScreen()
}