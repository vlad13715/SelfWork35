package com.example.selfwork35

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CounterDao {


    @Insert
    fun saveCounterDao(counterValue:Counter)

    @Query("SELECT * FROM counter")
    fun getCountFromDB():Long



}