package com.example.domain.entity

data class Pressure(
    val average: Double,
    val samplesOverTheSol: Long,
    val min: Double,
    val max: Double
)