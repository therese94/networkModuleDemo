package com.example.networkmoduledemo.data.remote

interface DemoDataSource {
    suspend fun getSuccessData(): String
    suspend fun getErrorData(): String
}