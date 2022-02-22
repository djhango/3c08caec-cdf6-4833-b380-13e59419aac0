package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import com.example.myapplication.ui.main.CurrencyListFragment
import com.example.myapplication.models.CurrencyInfo
import com.example.myapplication.services.implementations.DatabaseService
import com.example.myapplication.services.interfaces.IDatabaseService
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val databaseService = module { single { DatabaseService() }}

        val app = startKoin{modules(databaseService)}

        val databaseServiceImpl = app.koin.get<IDatabaseService>()

        val dataset: LiveData<List<CurrencyInfo>> = databaseServiceImpl.getCurrencyList(databaseServiceImpl.getDatabase(application))

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CurrencyListFragment.newInstance(dataset.value!!))
                .commitNow()
        }
    }
}