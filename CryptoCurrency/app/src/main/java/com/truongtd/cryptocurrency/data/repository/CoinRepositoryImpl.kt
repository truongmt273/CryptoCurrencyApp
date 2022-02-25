package com.truongtd.cryptocurrency.data.repository

import com.truongtd.cryptocurrency.data.remote.CoinPaprikaApi
import com.truongtd.cryptocurrency.data.remote.dto.CoinDetailDto
import com.truongtd.cryptocurrency.data.remote.dto.CoinDto
import com.truongtd.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinPaprikaApi: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return coinPaprikaApi.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return coinPaprikaApi.getCoinById(coinId)
    }

}