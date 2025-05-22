package com.example.cryptoapp.data.dataBase

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "full_price_list")
data class CoinInfoDbModel (
    val price : Int,
    @PrimaryKey
    val fromSymbol : String,
    val toSymbol : String,
    val lastUpdate : Long,
    val highDay : String,
    val lowDay : String,
    val lastMarket : String,
    val imageUrl : String,

)