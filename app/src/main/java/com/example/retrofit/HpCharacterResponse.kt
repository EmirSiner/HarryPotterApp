package com.example.retrofit

data class HpCharacterResponse(
    val results:List<HpCharacterResult>
)
data class HpCharacterResult(
    val house:Int,
    val name:String,
    val gender:String,
    val dateBirth:String,
    val ancestry:String
)
