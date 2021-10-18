package com.ivan.coin_converter.data.model

data class ErrorResponse (
    val status: Long,
    val code: String,
    val message: String
)
