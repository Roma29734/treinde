package com.example.data

import com.example.data.model.*
import com.example.domain.model.DayWorkoutModel
import com.example.domain.model.SportsmanModel
import com.example.domain.model.WorkoutModel

fun WorkoutModel.toEntity() = WorkoutEntity (
    id = id,
    nameExercise =  nameExercise,
    repetitions = repetitions,
    approaches = approaches
)

fun WorkoutEntity.toDomain() = WorkoutModel (
    id = id,
    nameExercise =  nameExercise,
    repetitions = repetitions,
    approaches = approaches
)

fun SportsmanEntity.toDomain() = SportsmanModel (
    id = id,
    name = name,
    age = age,
    weight = weight,
    growth = growth,
)

fun SportsmanModel.toEntity() = SportsmanEntity (
    id = id,
    name = name,
    age = age,
    weight = weight,
    growth = growth,
)

fun DayWorkoutModel.toEntity() = DayWorkoutEntity (
    id = id,
    idWorkout = idWorkout,
    nameWorkout = nameWorkout,
    sumApproach = sumApproach,
    completedApproach = completedApproach,
    receptions = receptions,
    timeWorkout = timeWorkout
)

fun DayWorkoutEntity.toDomain() = DayWorkoutModel (
    id = id,
    idWorkout = idWorkout,
    nameWorkout = nameWorkout,
    sumApproach = sumApproach,
    completedApproach = completedApproach,
    receptions = receptions,
    timeWorkout = timeWorkout
)

fun DayWorkoutModel.toTransit() = TransitDayWorkoutModel (
    id = id,
    idWorkout = idWorkout,
    nameWorkout = nameWorkout,
    sumApproach = sumApproach,
    completedApproach = completedApproach,
    receptions = receptions,
    timeWorkout = timeWorkout
)

fun TransitDayWorkoutModel.toDomain() = DayWorkoutModel (
    id = id,
    idWorkout = idWorkout,
    nameWorkout = nameWorkout,
    sumApproach = sumApproach,
    completedApproach = completedApproach,
    receptions = receptions,
    timeWorkout = timeWorkout
)

fun WorkoutModel.toTransit() = TransitWorkoutModel (
    id = id,
    nameExercise =  nameExercise,
    repetitions = repetitions,
    approaches = approaches
)

fun TransitWorkoutModel.toDomain() = WorkoutModel (
    id = id,
    nameExercise =  nameExercise,
    repetitions = repetitions,
    approaches = approaches
)