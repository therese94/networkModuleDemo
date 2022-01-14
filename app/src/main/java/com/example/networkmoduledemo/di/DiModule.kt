package com.example.networkmoduledemo.di

import com.example.networkmoduledemo.data.remote.DemoDataSource
import com.example.networkmoduledemo.data.remote.DemoDataSourceImpl
import com.example.networkmoduledemo.data.repository.DemoRepositoryImpl
import com.example.networkmoduledemo.domain.repository.DemoRepository
import com.example.networkmoduledemo.domain.usecase.GetErrorDataUseCase
import com.example.networkmoduledemo.domain.usecase.GetErrorDataUseCaseImpl
import com.example.networkmoduledemo.domain.usecase.GetSuccessDataUseCase
import com.example.networkmoduledemo.domain.usecase.GetSuccessDataUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DemoDataSourceModule {
    @Singleton
    @Binds
    abstract fun provideDemoDataSource(impl: DemoDataSourceImpl): DemoDataSource
}

@Module
@InstallIn(SingletonComponent::class)
abstract class DemoRepositoryModule {
    @Singleton
    @Binds
    abstract fun provideDemoRepository(impl: DemoRepositoryImpl): DemoRepository
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class GetErrorDataCaseModule {
    @Binds
    abstract fun provideGetErrorDataUseCase(impl: GetErrorDataUseCaseImpl): GetErrorDataUseCase
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class GetSuccessDataUseCaseModule {
    @Binds
    abstract fun provideGetSuccessDataUseCase(impl: GetSuccessDataUseCaseImpl): GetSuccessDataUseCase
}