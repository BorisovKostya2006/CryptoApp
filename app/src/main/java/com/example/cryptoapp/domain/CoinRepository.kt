package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData
import com.example.cryptoapp.data.model.CoinNameDto

interface CoinRepository {
    fun getListCoinInfo() : LiveData<List<CoinNameDto>>
    fun getCoinInfo(fromSymbl : String) : LiveData<CoinNameDto>
}