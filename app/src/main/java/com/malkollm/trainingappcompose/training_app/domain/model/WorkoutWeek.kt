package com.malkollm.trainingappcompose.training_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_week")
data class WorkoutWeek(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val number_week: Int
)
