package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData
import com.example.cryptoapp.data.model.CoinInfo

interface CoinRepository {
    fun getListCoinInfo() : LiveData<List<CoinInfo>>
    fun getCoinInfo(fromSymbl : String) : LiveData<CoinInfo>
}