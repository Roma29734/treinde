package com.example.trained.ui.screen.workout.finishedWorkout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.transit.WorkoutTransitionModel
import com.example.domain.model.DailyWorkoutDomainModel
import com.example.domain.userCase.DailyStatisticsInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FinishedViewModel @Inject constructor(
    private val dailyStatisticsInteractor: DailyStatisticsInteractor
): ViewModel() {

    fun updateDayWorkout(workoutTransitionModel: WorkoutTransitionModel) {
        viewModelScope.launch (Dispatchers.IO) {
            val dayWorkout = dailyStatisticsInteractor.readDayWorkout()
            val completeWorkout = DailyWorkoutDomainModel(
                nameWorkout = workoutTransitionModel.workoutModel.nameWorkout,
                sumApproach = workoutTransitionModel.workoutModel.sumApproach,
                completedApproach = workoutTransitionModel.workoutModel.completedApproach,
                receptions = workoutTransitionModel.workoutModel.receptions
            )
            dayWorkout!!.workout[workoutTransitionModel.workoutModel.id] = completeWorkout
            dayWorkout.timeWorkout = workoutTransitionModel.timeWorkout
            dailyStatisticsInteractor.updateDayWorkout(dayWorkout)
        }
    }
}