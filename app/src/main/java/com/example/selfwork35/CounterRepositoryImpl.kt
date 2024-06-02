package com.example.selfwork35

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class CounterRepositoryImpl(val counterDao: CounterDao) : CounterRepository {

    override fun saveCounter(counterValue: Long) {

        CoroutineScope(Dispatchers.IO).launch {
            counterDao.saveCounterDao(Counter(counterValue = counterValue))

        }
    }


    override suspend fun getCounterFromDB(): Long {

        val counterDiffered = CoroutineScope(Dispatchers.IO).async {

            counterDao.getCountFromDB()
        }

        return counterDiffered.await()
    }
}