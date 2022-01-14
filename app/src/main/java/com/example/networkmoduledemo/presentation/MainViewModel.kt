package com.example.networkmoduledemo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.networkmoduledemo.domain.usecase.GetErrorDataUseCase
import com.example.networkmoduledemo.domain.usecase.GetSuccessDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getSuccessDataUseCase: GetSuccessDataUseCase,
    private val getErrorDataUseCase: GetErrorDataUseCase,
): ViewModel() {
    private val _successData = MutableLiveData<String>()
    val successData: LiveData<String> = _successData

    private val _errorData = MutableLiveData<String>()
    val errorData: LiveData<String> = _errorData


    fun getSuccessData() {
        viewModelScope.launch {
            _successData.value = getSuccessDataUseCase().toString() ?: return@launch
        }
    }

    fun getErrorData() {
        viewModelScope.launch {
            _errorData.value = getErrorDataUseCase().toString() ?: return@launch
        }

    }
}