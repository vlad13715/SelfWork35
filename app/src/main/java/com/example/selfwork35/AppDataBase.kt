package com.example.selfwork35

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Counter::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun counterDao(): CounterDao
}