package com.example.cryptoapp.domain

class GetListCoinInfoUseCase(private val repository: CoinRepository) {
    operator fun invoke() = repository.getListCoinInfo()
}