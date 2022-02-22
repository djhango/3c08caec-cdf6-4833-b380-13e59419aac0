package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.models.CurrencyInfo

@Database(entities = [CurrencyInfo::class], version = 1, exportSchema = false)
abstract class CurrencyListDatabase : RoomDatabase() {
    abstract val currencyInfoDAO : CurrencyInfoDAO
}