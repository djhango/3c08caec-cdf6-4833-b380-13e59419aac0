package com.example.myapplication.services.interfaces

import com.example.myapplication.models.CurrencyInfo

interface IDatabaseService {
    fun getCurrencyList(): ArrayList<CurrencyInfo>
}