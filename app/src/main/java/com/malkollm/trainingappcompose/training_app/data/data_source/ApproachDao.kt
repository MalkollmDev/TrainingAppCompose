package com.malkollm.trainingappcompose.training_app.data.data_source

import androidx.room.*
import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import kotlinx.coroutines.flow.Flow

@Dao
interface ApproachDao {
    @Query("SELECT * FROM approach")
    fun getApproach(): Flow<List<Approach>>

    @Query("SELECT * FROM approach WHERE id = :id")
    suspend fun getApproachById(id: Int): Approach?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertApproach(approach: Approach)

    @Delete
    suspend fun deleteApproach(approach: Approach)
}