package com.malkollm.trainingappcompose.components.statistics

import android.content.Intent
import android.os.Parcelable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.android.parcel.Parcelize

//import com.malkollm.trainingappcompose.DetailTrainingInfo

@Parcelize
data class WorkoutDay(val value: Int) : Parcelable

@Composable
fun TrainingCardDay() {
    val roundedShape: Dp = 10.dp
    val workoutDay = listOf(
        WorkoutDay(50),
        WorkoutDay(57),
        WorkoutDay(60),
        WorkoutDay(75),
        WorkoutDay(80),
        WorkoutDay(50),
        WorkoutDay(57),
        WorkoutDay(60),
        WorkoutDay(75),
        WorkoutDay(80)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        workoutDay.map {
            item {
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
                            "${it.value}",
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
                            onClick = {
//                            mContext.startActivity(Intent(mContext, DetailTrainingInfo::class.java))
                            },
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
}

@Preview
@Composable
fun TrainingCardDayPrev() {
    TrainingCardDay()
}