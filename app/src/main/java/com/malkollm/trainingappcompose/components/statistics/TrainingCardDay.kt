package com.malkollm.trainingappcompose.components.statistics

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TrainingCardDay() {
    val roundedShape: Dp = 10.dp
    val trainingCounts = listOf(50, 57, 60, 75, 80)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        trainingCounts.forEach { count ->
            Card(
                shape = RoundedCornerShape(roundedShape),
                elevation = 10.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Row(
                    modifier = Modifier.height(50.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = "Go back home",
                        modifier = Modifier
                            .weight(0.5f)
                            .height(50.dp)
                            .padding(10.dp)
                    )
                    Text(
                        "2 августа 2022 - 1 день назад",
                        textAlign = TextAlign.Left,
                        modifier = Modifier
                            .weight(2f)
                            .height(50.dp)
                            .padding(12.dp),
                        style = TextStyle(
                            fontSize = 18.sp
                        )
                    )
                    Text(
                        "$count",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(0.5f)
                            .height(50.dp)
                            .padding(12.dp),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.weight(0.5f)
                    ) {
                        Icon(
                            Icons.Rounded.ArrowForward,
                            contentDescription = "Информация о приложении"
                        )
                    }
                }
            }

        }
    }
}