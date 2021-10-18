package com.ivan.coin_converter.domain

import com.ivan.coin_converter.core.UseCase
import com.ivan.coin_converter.data.model.ExchangeResponseValue
import com.ivan.coin_converter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}