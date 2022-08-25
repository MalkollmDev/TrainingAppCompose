package com.malkollm.trainingappcompose.training_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout")
data class Workout(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val id_day: Int
)
