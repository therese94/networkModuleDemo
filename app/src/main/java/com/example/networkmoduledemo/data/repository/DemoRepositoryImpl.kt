package com.example.networkmoduledemo.data.repository

import com.example.networkmoduledemo.data.remote.DemoDataSource
import com.example.networkmoduledemo.domain.repository.DemoRepository
import javax.inject.Inject

class DemoRepositoryImpl @Inject constructor(
    private val demoDataSource: DemoDataSource,
) : DemoRepository {
    override suspend fun getSuccessData(): String = demoDataSource.getSuccessData()
    override suspend fun getErrorData(): String = demoDataSource.getErrorData()
}