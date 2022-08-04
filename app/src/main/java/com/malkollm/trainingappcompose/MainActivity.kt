package com.malkollm.trainingappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.malkollm.trainingappcompose.components.statistics.TrainingCardDay
import com.malkollm.trainingappcompose.components.statistics.TrainingChartPushUp
import com.malkollm.trainingappcompose.components.statistics.TrainingStatistic
import com.malkollm.trainingappcompose.ui.theme.TrainingAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BarChartScreen()
        }
    }
}

@Composable
fun MainContent() {
    val trainingCounts = listOf(50, 57, 60, 75, 80)

    Column(modifier = Modifier.fillMaxSize()) {
        TrainingChartPushUp(trainingCounts)
        TrainingStatistic(trainingCounts)
        TrainingCardDay(trainingCounts)
    }
}

@Composable
fun BarChartScreen() {
    Scaffold(topBar = {
        TopAppBar(navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "App"
                )
            }
        }, title = { Text(text = "Прогресс тренировок") })
    }) {
        MainContent()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TrainingAppComposeTheme {
        MainContent()
    }
}