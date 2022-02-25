package com.truongtd.cryptocurrency.presentation.coin_detail

import com.truongtd.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)