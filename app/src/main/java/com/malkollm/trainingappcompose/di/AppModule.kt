package com.malkollm.trainingappcompose.di

import android.app.Application
import androidx.room.Room
import com.malkollm.trainingappcompose.training_app.data.data_source.WorkoutDatabase
import com.malkollm.trainingappcompose.training_app.data.repository.WorkoutRepositoryImpl
import com.malkollm.trainingappcompose.training_app.domain.repository.ApproachRepository
import com.malkollm.trainingappcompose.training_app.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideWorkoutDatabase(app: Application): WorkoutDatabase {
        return Room.databaseBuilder(
            app,
            WorkoutDatabase::class.java,
            WorkoutDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideApproachRepository(db: WorkoutDatabase): ApproachRepository {
        return WorkoutRepositoryImpl(db.approachDao)
    }

    @Provides
    @Singleton
    fun provideApproachUseCases(repository: ApproachRepository): ApproachUseCase {
        return ApproachUseCase(
            getApproach = GetApproach(repository),
            deleteApproach = DeleteApproach(repository),
            addApproach = AddApproach(repository),
            getApproaches = GetApproaches(repository)
        )
    }
}