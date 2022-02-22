package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.myapplication.R
import com.example.myapplication.models.CurrencyInfo
import java.util.*
import kotlin.collections.ArrayList

class CurrencyListFragment(private val dataset: List<CurrencyInfo>) : Fragment() {

    lateinit var itemClickListener: AdapterView.OnItemClickListener

    companion object {
        fun newInstance(dataset: List<CurrencyInfo>) = CurrencyListFragment(dataset)
    }

    private val viewModel: CurrencyListViewModel = ViewModelProvider(this).get(CurrencyListViewModel(dataset)::class.java)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //itemClickListener = AdapterView.OnItemClickListener()
        // TODO: Use the ViewModel
    }
}