package com.example.networkmoduledemo.domain.usecase

import com.example.networkmoduledemo.domain.repository.DemoRepository
import javax.inject.Inject

class GetSuccessDataUseCaseImpl @Inject constructor(
    private val demoRepository: DemoRepository,
) : GetSuccessDataUseCase {
    override suspend fun invoke() = demoRepository.getSuccessData()
}