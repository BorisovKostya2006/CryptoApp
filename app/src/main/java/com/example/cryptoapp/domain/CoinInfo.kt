package com.example.cryptoapp.domain

import android.R

data class CoinInfo(
    val price : Int,
    val fromSymbol : String,
    val toSymbol : String,
    val lastUpdate : Long,
    val highDay : String,
    val lowDay : String,
    val lastMarket : String,
    val imageUrl : String)
