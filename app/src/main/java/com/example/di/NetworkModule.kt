package com.example.di


import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun networkModule(){
    Retrofit.Builder()
    .baseUrl("http://hp-api.herokuapp.com/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    }

}