package com.malkollm.trainingappcompose.training_app.domain.repository

import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import kotlinx.coroutines.flow.Flow

interface ApproachRepository {
    fun getApproaches(): Flow<List<Approach>>

    suspend fun getApproachById(id: Int): Approach?

    suspend fun insertApproach(approach: Approach)

    suspend fun deleteApproach(approach: Approach)
}