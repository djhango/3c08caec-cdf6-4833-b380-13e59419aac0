package com.example.myapplication.services.interfaces

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.myapplication.data.CurrencyListDatabase
import com.example.myapplication.models.CurrencyInfo

interface IDatabaseService {
    fun getDatabase(application: Application): CurrencyListDatabase
    fun getCurrencyList(database: CurrencyListDatabase): LiveData<List<CurrencyInfo>>
}