package com.example.networkmodule

import com.example.networkmvvm.data.network.NetworkResponseAdapter
import com.example.networkmvvm.data.network.NetworkResponseAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class DemoApiService {

    fun provideRetrofit(): DemoApiInterface {
        return Retrofit.Builder().baseUrl(DEMO_API_URL)
            .addCallAdapterFactory(NetworkResponseAdapterFactory())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create()).build().create(DemoApiInterface::class.java)
    }

    companion object {
        private const val DEMO_API_URL = "https://retroftcoroutines.free.beeceptor.com/"
    }
}