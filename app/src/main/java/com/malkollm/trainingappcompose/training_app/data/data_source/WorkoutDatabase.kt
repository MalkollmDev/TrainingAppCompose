package com.malkollm.trainingappcompose.training_app.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.malkollm.trainingappcompose.training_app.domain.model.Approach

@Database(
    entities = [Approach::class],
    version = 1
)
abstract class WorkoutDatabase : RoomDatabase() {

    abstract val approachDao: ApproachDao

    companion object {
        const val DATABASE_NAME = "approaches_db"
    }
}