package com.malkollm.trainingappcompose.training_app.domain.use_case

import com.malkollm.trainingappcompose.training_app.domain.model.Approach
import com.malkollm.trainingappcompose.training_app.domain.model.InvalidApproachException
import com.malkollm.trainingappcompose.training_app.domain.repository.ApproachRepository

class AddApproach (
    private val repository: ApproachRepository
) {

    @Throws(InvalidApproachException::class)
    suspend operator fun invoke(approach: Approach) {
        if(approach.count == 0) {
            throw InvalidApproachException("Количество подходов не может быть пустым")
        }
        if(approach.rest_time == 0) {
            throw InvalidApproachException("Время отдыха не может быть пустым")
        }
        repository.insertApproach(approach)
    }
}