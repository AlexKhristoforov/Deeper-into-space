package com.example.localdb.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "Sol")
data class Sol (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "sol")
    val sol: String,
    @Embedded
    val temperature: Temperature,
    @Embedded
    val windSpeed: WindSpeed,
    @Embedded
    val pressure: Pressure,
    @Embedded
    val windDirections: WindDirections,
    @ColumnInfo(name = "season")
    val season: String,
    @ColumnInfo(name = "firstUtc")
    val firstUtc: Date,
    @ColumnInfo(name = "lastUtc")
    val lastUtc: Date
)