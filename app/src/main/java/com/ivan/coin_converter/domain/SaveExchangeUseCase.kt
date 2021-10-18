package com.ivan.coin_converter.domain

import com.ivan.coin_converter.core.UseCase
import com.ivan.coin_converter.data.model.ExchangeResponseValue
import com.ivan.coin_converter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}