package com.malkollm.trainingappcompose.training_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "approach")
data class Approach(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val id_workout: Int,
    val count: Int,
    val rest_time: Int,
    val is_complete: Boolean
)

class InvalidApproachException(message: String): Exception(message)
