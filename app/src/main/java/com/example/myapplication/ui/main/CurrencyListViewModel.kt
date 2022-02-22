package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModel
import com.example.myapplication.models.CurrencyInfo

class CurrencyListViewModel(private val dataset: List<CurrencyInfo>) : ViewModel() {
    val currencyList: List<CurrencyInfo> = dataset

    // TODO: Implement the ViewModel
}