package com.example.selfwork35

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="counter")
data class Counter(@PrimaryKey(autoGenerate = true)val id:Long=0,val counterValue:Long)
