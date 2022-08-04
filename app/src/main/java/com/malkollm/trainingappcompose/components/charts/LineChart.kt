package com.malkollm.trainingappcompose.components.charts

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LineChart(
    trainingCounts: List<Int>,
    strokeColor: Color = Color.Blue
) {
    val points: MutableList<Float> = mutableListOf()

    for (count in trainingCounts) {
        var temp = 0f
        temp = count * 0.01f
        points.add(temp)
    }
//    val points = listOf(0.9f, 0.5f, 1f, 0.2f, 0.7f, 0.9f, 0.5f, 1f, 0.2f, 0.7f)
    val strokeSize = 5f
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {

        val widthGap = size.width / (points.size + 1)

        clipPath(path = Path().apply {
            moveTo(0f, 0f)
            lineTo(0f, size.height)
            lineTo(size.width, size.height)
            lineTo(size.width, 0f)
            close()
        }) {
            val path = Path().apply {
                moveTo(strokeSize * -1, size.height + strokeSize)
                lineTo(strokeSize * -1, size.height - (size.height * points.first()))
            }

            for (x in 1..points.size - 2) {
                path.lineTo((x + 1) * widthGap, size.height - (size.height * points[x]))
            }

            path.lineTo(size.width + strokeSize, size.height - (size.height * points.last()))
            path.lineTo(size.width + strokeSize, size.height + strokeSize)
            path.close()
            drawPath(path, color = strokeColor, style = Stroke(width = strokeSize))

            clipPath(path){
                drawRect(
                    brush = Brush.linearGradient(
                        listOf(
                            strokeColor.copy(alpha = 0.1f),
                            strokeColor.copy(alpha = 0.3f),
                            strokeColor.copy(alpha = 0.8f),
                        ),
                        start = Offset(center.x, 0f),
                        end = Offset(center.x, size.height),
                    ),
                    size = size
                )
//                drawCircle(color = strokeColor.copy(alpha = 0.3f),radius = size.width)
            }
        }
    }
}

@Preview
@Composable
fun LineChartPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(16.dp)
    ) {
//        LineChart(trainingCounts = trainingCounts, strokeColor = Color(0xffA34054))
    }

}