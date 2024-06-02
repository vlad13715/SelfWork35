package com.example.selfwork35

class IncraseCounter(private val repository: CounterRepository) {

    fun invoke(counterValue: Long){

        repository.saveCounter(counterValue)
    }



}