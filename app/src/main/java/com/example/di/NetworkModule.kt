package com.example.di


import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
    .baseUrl("http://hp-api.herokuapp.com/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    }

}