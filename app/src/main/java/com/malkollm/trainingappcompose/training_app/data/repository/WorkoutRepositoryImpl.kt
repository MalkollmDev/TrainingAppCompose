package com.malkollm.trainingappcompose.training_app.data.repository

import com.malkollm.trainingappcompose.training_app.data.data_source.ApproachDao
import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import com.malkollm.trainingappcompose.training_app.domain.repository.ApproachRepository
import kotlinx.coroutines.flow.Flow

class WorkoutRepositoryImpl(
    private val dao: ApproachDao
) : ApproachRepository {

    override fun getApproaches(): Flow<List<Approach>> {
        return dao.getApproach()
    }

    override suspend fun getApproachById(id: Int): Approach? {
        return dao.getApproachById(id)
    }

    override suspend fun insertApproach(approach: Approach) {
        dao.insertApproach(approach)
    }

    override suspend fun deleteApproach(approach: Approach) {
        dao.deleteApproach(approach)
    }
}