package com.example.myapplication.services.implementations

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.data.CurrencyListDatabase
import com.example.myapplication.models.CurrencyInfo
import com.example.myapplication.services.interfaces.IDatabaseService

class DatabaseService : IDatabaseService {
    override fun getDatabase(application: Application): CurrencyListDatabase {
        return Room.databaseBuilder(application, CurrencyListDatabase::class.java, "currency_list_table").build()
    }

    override fun getCurrencyList(database: CurrencyListDatabase): LiveData<List<CurrencyInfo>> {
        return database.currencyInfoDAO.getAllCurrencies()
    }
}