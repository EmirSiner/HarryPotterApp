package com.example.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
    .baseUrl("http://hp-api.herokuapp.com/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    }

    @Provides
    @Singleton
    fun provideCharacterService(retrofit: Retrofit): CharacterService {
        return retrofit.create(CharacterService::class.java)

    }

}