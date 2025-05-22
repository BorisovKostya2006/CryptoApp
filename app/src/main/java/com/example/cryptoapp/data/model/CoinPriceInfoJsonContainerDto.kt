package com.example.cryptoapp.data.model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoJsonContainerDto (
    @SerializedName("RAW")
    @Expose
    val json: JsonObject? = null
)
