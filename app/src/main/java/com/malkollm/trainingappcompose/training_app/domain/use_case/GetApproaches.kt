package com.malkollm.trainingappcompose.training_app.domain.use_case

import android.provider.ContactsContract
import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import com.malkollm.trainingappcompose.training_app.domain.repository.ApproachRepository
import kotlinx.coroutines.flow.Flow

class GetApproaches(
    private val repository: ApproachRepository
) {

    operator fun invoke(): Flow<List<Approach>> {
        return repository.getApproaches()
    }
}