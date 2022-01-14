package com.example.networkmoduledemo.domain.usecase

import com.example.networkmoduledemo.domain.repository.DemoRepository
import javax.inject.Inject

interface GetSuccessDataUseCase {
    suspend operator fun invoke(): String
}