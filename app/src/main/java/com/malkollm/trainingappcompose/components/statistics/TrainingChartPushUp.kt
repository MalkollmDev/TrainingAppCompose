package com.malkollm.trainingappcompose.components.statistics

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.malkollm.trainingappcompose.components.charts.LineChart
import com.malkollm.trainingappcompose.ui.theme.TrainingAppComposeTheme

@Composable
fun TrainingChartPushUp(trainingCounts: List<Int>) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                "Прогресс отжиманий",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 24.sp
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            LineChart(trainingCounts, strokeColor = Color(0xFF7e2828))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TrainingChartPushUpPrev() {
    TrainingAppComposeTheme {
//        TrainingChartPushUp(trainingCounts)
    }
}