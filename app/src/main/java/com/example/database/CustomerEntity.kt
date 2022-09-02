package com.example.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CustomerTable")
data class CustomerEntity(
    @PrimaryKey @ColumnInfo(name="costumer_name")val customerId:Int,
    val customerName:String,
    val customerSurname:String
)

// @PrimaryKey(autoGenerate = true) otomatiak şekilde atar idleri
