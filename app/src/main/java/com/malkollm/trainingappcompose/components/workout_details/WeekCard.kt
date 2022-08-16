package com.malkollm.trainingappcompose.components.workout_details

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeekCard() {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                "7-17 минут",
                textAlign = TextAlign.Left,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 16.dp, top = 10.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Text(
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .vertical()
                        .rotate(-90f)
                        .fillMaxWidth()
                        .padding(start = 8.dp, top = 5.dp, bottom = 5.dp, end = 8.dp),
                    text = "1 неделя"
                )
                DayCard()
                DayCard()
                DayCard()
                DayCard()
                DayCard()
                DayCard()
                DayCard()
            }
        }
    }
    Spacer(modifier = Modifier.height(12.dp))
}

fun Modifier.vertical() =
    layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        layout(placeable.height, placeable.width) {
            placeable.place(
                x = -(placeable.width / 2 - placeable.height / 2),
                y = -(placeable.height / 2 - placeable.width / 2)
            )
        }
    }

@Preview
@Composable
fun WeekCardPrev() {
    WeekCard()
}