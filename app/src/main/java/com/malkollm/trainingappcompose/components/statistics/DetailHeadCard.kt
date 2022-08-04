package com.malkollm.trainingappcompose.components.statistics

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailHeadCard() {
    val fontSizeCard = 20.sp
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "App",
                modifier = Modifier
                    .size(120.dp)
                    .padding(16.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp, bottom = 10.dp)
            ) {
                Text(
                    "Отжимания",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 35.sp
                    )
                )
                Text(
                    "Подходы  $5",
                    style = TextStyle(
                        fontSize = fontSizeCard
                    )
                )
                Text(
                    "За тренировку   $50",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = fontSizeCard
                    )
                )
                Text(
                    "Дата   $1 августа 2022",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = fontSizeCard
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun DetailHeadCardPrev() {
    DetailHeadCard()
}