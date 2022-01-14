package com.example.networkmoduledemo.domain.usecase

import com.example.networkmoduledemo.domain.repository.DemoRepository
import javax.inject.Inject

interface GetErrorDataUseCase {
    suspend operator fun invoke(): String
}