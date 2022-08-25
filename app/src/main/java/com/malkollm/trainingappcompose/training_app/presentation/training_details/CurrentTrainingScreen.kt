package com.malkollm.trainingappcompose.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.malkollm.trainingappcompose.R
import com.malkollm.trainingappcompose.training_app.presentation.utils.Timer
import com.malkollm.trainingappcompose.training_app.presentation.training_details.NumberPushUp

@Composable
fun CurrentTrainingScreen(
) {
    Scaffold {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            Text(
                "Тренировка",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                // call the function Timer
                // and pass the values
                // it is defined below.
                Timer(
                    totalTime = 100L * 500L,
                    handleColor = Color.Green,
                    inactiveBarColor = Color.DarkGray,
                    activeBarColor = Color(0xFF1776d1),
                    modifier = Modifier.size(350.dp)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_add_time),
                    contentDescription = "Add time",
                    modifier = Modifier
                        .clickable { }
                )
                Spacer(modifier = Modifier.width(135.dp))
                Icon(
                    painterResource(id = R.drawable.ic_sub_time),
                    contentDescription = "Sub time",
//                    modifier = Modifier
//                        .fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.width(135.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                NumberPushUp()
                NumberPushUp()
                NumberPushUp()
                NumberPushUp()
                NumberPushUp()
            }
        }
    }
}

@Preview
@Composable
fun CurrentTrainingScreenPrev() {
    CurrentTrainingScreen()
}