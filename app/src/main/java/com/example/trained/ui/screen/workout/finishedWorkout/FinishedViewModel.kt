package com.example.trained.ui.screen.workout.finishedWorkout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trained.data.model.DayWorkoutModel
import com.example.trained.domain.repository.TrainedRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FinishedViewModel @Inject constructor(
    private val repository: TrainedRepository,
): ViewModel() {

    fun updateDayWorkout(dayWorkoutModel: DayWorkoutModel) {
        viewModelScope.launch (Dispatchers.IO) {
            repository.updateDayWorkout(dayWorkoutModel)
        }
    }
}