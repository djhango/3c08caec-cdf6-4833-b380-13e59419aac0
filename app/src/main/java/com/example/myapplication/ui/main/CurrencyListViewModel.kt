package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModel
import com.example.myapplication.models.CurrencyInfo

class CurrencyListViewModel(private val dataset: ArrayList<CurrencyInfo>) : ViewModel() {
    val currencyList: ArrayList<CurrencyInfo> = dataset

    // TODO: Implement the ViewModel
}