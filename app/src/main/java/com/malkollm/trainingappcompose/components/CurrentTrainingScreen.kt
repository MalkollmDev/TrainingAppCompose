package com.malkollm.trainingappcompose.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.malkollm.trainingappcompose.components.timer_details.Timer

@Composable
fun CurrentTrainingScreen(
) {
    Scaffold {
        Box(
            contentAlignment = Alignment.Center
        ) {
            // call the function Timer
            // and pass the values
            // it is defined below.
            Timer(
                totalTime = 100L * 1000L,
                handleColor = Color.Green,
                inactiveBarColor = Color.DarkGray,
                activeBarColor = Color(0xFF37B900),
                modifier = Modifier.size(200.dp)
            )
        }
    }
}

@Preview
@Composable
fun CurrentTrainingScreenPrev() {
    CurrentTrainingScreen()
}