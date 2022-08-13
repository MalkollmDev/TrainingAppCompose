package com.malkollm.trainingappcompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(word: Word) {
    Scaffold {
        Text(
            "List screen -> ${word.value}",
            modifier = Modifier.padding(24.dp)
        )
    }
}