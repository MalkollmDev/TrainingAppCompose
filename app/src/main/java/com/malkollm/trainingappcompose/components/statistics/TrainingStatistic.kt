package com.malkollm.trainingappcompose.components.statistics

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TrainingStatistic(trainingStatistics: List<Int>) {
    val textSizeContent: TextUnit = 16.sp
    val cardHeight: Dp = 120.dp
    val trainingCount = trainingStatistics.size

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 10.dp,
            modifier = Modifier
                .height(cardHeight)
                .width(cardHeight)
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
            ) {
                Text(
                    "Тренировок",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    "$trainingCount",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent,
                        fontWeight = FontWeight.Bold,
                    )
                )
            }
        }
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 10.dp,
            modifier = Modifier
                .height(cardHeight)
                .width(cardHeight)
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
            ) {
                Text(
                    "Выполнено упражнений",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    "1940",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent,
                        fontWeight = FontWeight.Bold,
//                        color = Color.Green
                    )
                )
            }
        }
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 10.dp,
            modifier = Modifier
                .height(cardHeight)
                .width(cardHeight)
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
            ) {
                Text(
                    "Выполнено подходов",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent
                    )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    "7531",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = textSizeContent,
                        fontWeight = FontWeight.Bold,
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TrainingStatisticPrev() {
//    TrainingStatistic(trainingCounts.size)
}