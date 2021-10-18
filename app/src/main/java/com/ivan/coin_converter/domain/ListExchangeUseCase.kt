package com.ivan.coin_converter.domain

import com.ivan.coin_converter.core.UseCase
import com.ivan.coin_converter.data.model.ExchangeResponseValue
import com.ivan.coin_converter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}