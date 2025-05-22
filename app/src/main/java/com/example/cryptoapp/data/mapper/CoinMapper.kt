package com.example.cryptoapp.data.mapper

import com.example.cryptoapp.data.dataBase.CoinInfoDbModel
import com.example.cryptoapp.data.model.CoinInfoListOfDataDto
import com.example.cryptoapp.data.model.CoinPriceInfo
import com.example.cryptoapp.data.model.CoinPriceInfoJsonContainerDto
import com.example.cryptoapp.domain.CoinInfo
import com.google.gson.Gson
import kotlin.String
import kotlin.collections.mutableListOf

class CoinMapper {
    fun mapDtoToDbModel(dto: CoinInfo): CoinInfoDbModel {
        return CoinInfoDbModel(
            fromSymbol = dto.fromSymbol,
            toSymbol = dto.toSymbol,
            lastUpdate = dto.lastUpdate,
            highDay = dto.highDay,
            lowDay = dto.lowDay,
            lastMarket = dto.lastMarket,
            imageUrl = dto.imageUrl,
            price = dto.price
        )
    }

    fun mapJsonConvertorToListCoinInfo(jsonContainerDto: CoinPriceInfoJsonContainerDto): List<CoinInfo> {
        val result = mutableListOf<CoinInfo>()
        val jsonObject = jsonContainerDto.json ?: return result
        val coinKeySet = jsonObject.keySet()
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    CoinInfo::class.java
                )
                result.add(priceInfo)
            }
        }
        return result

    }
}
