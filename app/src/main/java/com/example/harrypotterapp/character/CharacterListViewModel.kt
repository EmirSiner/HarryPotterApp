package com.example.harrypotterapp.character

import androidx.lifecycle.ViewModel
import com.example.di.CharacterService
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(private val characterService: CharacterService): ViewModel() {

}