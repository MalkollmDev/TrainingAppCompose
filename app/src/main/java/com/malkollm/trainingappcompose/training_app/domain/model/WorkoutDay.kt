package com.malkollm.trainingappcompose.training_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_day")
data class WorkoutDay(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val id_week: Int,
    val number_day: Int
)
