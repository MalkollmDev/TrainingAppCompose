package com.malkollm.trainingappcompose.training_details

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp

@Composable
fun NumberPushUp () {
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
            "30",
            center.x + 1,
            center.y + 16,
            paint,
        )
    }
}