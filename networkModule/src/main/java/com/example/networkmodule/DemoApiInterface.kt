package com.example.networkmodule

import com.example.networkmvvm.data.network.NetworkResponse
import retrofit2.http.GET

interface DemoApiInterface {
    @GET("success")
    suspend fun getSuccess(): NetworkResponse<String, String>

    @GET("error")
    suspend fun getError(): NetworkResponse<String, String>
}