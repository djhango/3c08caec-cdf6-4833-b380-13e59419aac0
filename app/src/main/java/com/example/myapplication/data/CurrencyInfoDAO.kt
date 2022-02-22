package com.example.myapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.myapplication.models.CurrencyInfo
import kotlinx.coroutines.flow.Flow

@Dao
interface CurrencyInfoDAO {
    @Query("SELECT * FROM currency_list_table")
    fun getAllCurrencies(): LiveData<List<CurrencyInfo>>
}