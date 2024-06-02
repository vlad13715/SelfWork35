package com.example.selfwork35

interface CounterRepository {


     fun saveCounter(counterValue:Long)

     suspend fun getCounterFromDB():Long
}