package com.example.trained.domain.repository

import com.example.trained.data.model.DayWorkoutModel
import com.example.trained.data.model.SportsmanModel
import com.example.trained.data.model.WorkoutModel

interface TrainedRepository {

    suspend fun insertUser(user: SportsmanModel)

    suspend fun updateUser(user: SportsmanModel)

    suspend fun deleteUser(user: SportsmanModel)

    suspend fun readUserTable(): SportsmanModel?

    suspend fun getSizeSportsmanTable(): Int

    suspend fun insertWorkout(day: WorkoutModel): Long

    suspend fun updateWorkout(day: WorkoutModel)

    suspend fun readWorkoutTable(): List<WorkoutModel>

    suspend fun getSizeWorkoutTable(): Int

    suspend fun insertDayWorkout(workout: DayWorkoutModel): Long

    suspend fun updateDayWorkout(workout: DayWorkoutModel)

    suspend fun readDayWorkout(): List<DayWorkoutModel>?

    suspend fun getDayWorkoutById(id: Int): DayWorkoutModel

    suspend fun getSizeDayWorkoutTable(): Int
}