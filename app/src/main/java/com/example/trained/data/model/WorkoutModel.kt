package com.example.trained.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "workout_base")
data class WorkoutModel (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "nameExercise") val nameExercise: String,
    @ColumnInfo(name = "repetitions") val repetitions: Int,
    @ColumnInfo(name = "approaches") val approaches: Int,
): Parcelable