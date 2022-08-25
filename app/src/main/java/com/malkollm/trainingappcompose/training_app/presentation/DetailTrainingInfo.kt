package com.malkollm.trainingappcompose.training_app.presentation

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.malkollm.trainingappcompose.training_app.presentation.components.HeadCard
import com.malkollm.trainingappcompose.ui.theme.TrainingAppComposeTheme

class DetailTrainingInfo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrainingAppComposeTheme {
                BarDetailScreen()
            }
        }
    }
}

@Composable
fun DetailInfo() {
    val approachesCount = listOf(5, 7, 15, 25, 10, 100)
    Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 50f
        color = Color.White.toArgb()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        HeadCard()

        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    "Общее время   $24:40",
                    style = TextStyle(fontSize = 20.sp),
                    modifier = Modifier.padding(8.dp)
                )
                Divider(color = Color.Blue, thickness = 1.dp)
                approachesCount.forEach { count ->
                    Card(
                        shape = RoundedCornerShape(10.dp),
                        elevation = 10.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                    ) {
                        Row(
                            modifier = Modifier.height(60.dp)
                        ) {
                            val paint = Paint().apply {
                                textAlign = Paint.Align.CENTER
                                textSize = 50f
                                color = Color.White.toArgb()
                            }
                            Canvas(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(60.dp)
                                    .padding(10.dp)
                            ) {
                                drawCircle(
                                    color = Color(0xFF1776d1),
                                )
                                drawContext.canvas.nativeCanvas.drawText(
                                    "$count",
                                    center.x + 1,
                                    center.y + 16,
                                    paint,
                                )
                            }
                            Text(
                                "$20 сек",
                                textAlign = TextAlign.Start,
                                modifier = Modifier
                                    .weight(1f)
                                    .height(60.dp)
                                    .padding(top = 15.dp, bottom = 15.dp, start = 5.dp),
                                style = TextStyle(
                                    fontSize = 18.sp
                                )
                            )
                            Text(
                                "Выполнил",
                                textAlign = TextAlign.End,
                                modifier = Modifier
                                    .weight(1.5f)
                                    .height(60.dp)
                                    .padding(15.dp),
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BarDetailScreen() {
    Scaffold(topBar = {
        TopAppBar(navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "App"
                )
            }
        }, title = { Text(text = "Детальная информация") })
    }) {
        DetailInfo()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    TrainingAppComposeTheme {
        BarDetailScreen()
    }
}