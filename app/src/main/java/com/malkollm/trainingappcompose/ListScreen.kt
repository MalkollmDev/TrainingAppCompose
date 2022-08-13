package com.malkollm.trainingappcompose

import android.os.Parcelable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Word(val value: String): Parcelable

@Composable
fun ListScreen(
    navController: NavController
) {
    val testArray = listOf(
        Word("Hello"),
        Word("World"),
        Word("Earth"),
        Word("Vk"),
        Word("Instagram"),
        Word("Hello"),
        Word("World"),
        Word("Earth"),
        Word("Vk"),
        Word("Instagram"),
        Word("Hello"),
        Word("World"),
        Word("Earth"),
        Word("Vk"),
        Word("Instagram")
    )

    Scaffold {
        LazyColumn {
            testArray.map {
                item {
                    Text(it.value, modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(
                                "Details",
                                bundleOf("WORD_KEY" to it)
                            )
                        }
                    )
                }
            }
        }
    }
}