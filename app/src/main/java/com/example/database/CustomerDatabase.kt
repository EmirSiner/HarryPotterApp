package com.example.database

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [CustomerEntity::class], version = 1)
abstract class CustomerDatabase:RoomDatabase() {

    abstract fun customerDao():CustomerDao
}

object CustomerDAtabaseMAnager{
    object {
        private var customerDatabase:CustomerDatabase?=null

    }
}