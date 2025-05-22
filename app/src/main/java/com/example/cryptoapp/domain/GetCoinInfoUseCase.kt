package com.example.cryptoapp.domain

class GetCoinInfoUseCase (private val repository: CoinRepository,  ){
    operator fun invoke(fromSymbl: String) = repository.getCoinInfo(fromSymbl)
}