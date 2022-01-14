package com.example.networkmoduledemo.domain.usecase

import com.example.networkmoduledemo.domain.repository.DemoRepository
import javax.inject.Inject

class GetErrorDataUseCaseImpl @Inject constructor(
    private val demoRepository: DemoRepository,
): GetErrorDataUseCase {
    override suspend fun invoke() = demoRepository.getErrorData()
}