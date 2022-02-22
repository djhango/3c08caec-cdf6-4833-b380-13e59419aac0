package com.example.myapplication.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "currency_list_table")
data class CurrencyInfo(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id:String,

    @ColumnInfo(name = "name")
    var name:String,

    @ColumnInfo(name = "symbol")
    var symbol:String
)