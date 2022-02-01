package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.models.CurrencyInfo
import java.util.*
import kotlin.collections.ArrayList

class CurrencyListFragment(val dataset: ArrayList<CurrencyInfo>) : Fragment() {

    companion object {
        fun newInstance(dataset: ArrayList<CurrencyInfo>) = CurrencyListFragment(dataset)
    }

    private lateinit var viewModel: CurrencyListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrencyListViewModel(dataset)::class.java)
        // TODO: Use the ViewModel
    }
}