package com.example.networkmoduledemo.domain.repository

interface DemoRepository {
    suspend fun getSuccessData(): String
    suspend fun getErrorData(): String
}
