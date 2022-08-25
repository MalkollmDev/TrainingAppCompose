package com.malkollm.trainingappcompose.training_app.domain.use_case

import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import com.malkollm.trainingappcompose.training_app.domain.repository.ApproachRepository

class GetApproach(
    private val repository: ApproachRepository
) {

    suspend operator fun invoke(id: Int): Approach? {
        return repository.getApproachById(id)
    }
}