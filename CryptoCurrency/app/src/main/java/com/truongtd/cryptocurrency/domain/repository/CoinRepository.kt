package com.truongtd.cryptocurrency.domain.repository

import com.truongtd.cryptocurrency.data.remote.dto.CoinDetailDto
import com.truongtd.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}