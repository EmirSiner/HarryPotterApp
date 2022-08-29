package com.example.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.di.CharacterService
import com.example.retrofit.HpCharacterResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(private val characterService: CharacterService): ViewModel() {
    private val hpLiveData= MutableLiveData<HpCharacterResponse>()
    val hpCharacterLiveData:LiveData<HpCharacterResponse> = hpLiveData

}