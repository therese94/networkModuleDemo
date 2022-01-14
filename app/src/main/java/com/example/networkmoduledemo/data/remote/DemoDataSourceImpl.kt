package com.example.networkmoduledemo.data.remote

import android.util.Log
import com.example.networkmodule.DemoApiService
import com.example.networkmvvm.data.network.NetworkResponse
import javax.inject.Inject

class DemoDataSourceImpl @Inject constructor() : DemoDataSource {

    val demoApiInterface = DemoApiService().provideRetrofit()

    override suspend fun getSuccessData(): String {
        return handleResult(demoApiInterface.getSuccess())
    }

    override suspend fun getErrorData(): String {
        return handleResult(demoApiInterface.getError())
    }

    private fun handleResult(response: NetworkResponse<*, *>): String {
        when (response) {
            is NetworkResponse.Success -> {
                Log.i("demo success", response.body.toString())
                return response.body
            }
            is NetworkResponse.ApiError -> {
                Log.i("api error", response.body.toString())
                return response.toString()
            }
            is NetworkResponse.NetworkError -> {
                Log.i("Net work error", response.error.toString())
                return response.toString()
            }
            is NetworkResponse.UnknownError -> {
                Log.i("unknown error", response.error.toString())
                return response.toString()
            }
        }
    }
}