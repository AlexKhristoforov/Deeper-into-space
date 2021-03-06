package com.example.data.weatherRepository

import android.content.Context
import com.example.domain.repositories.WeatherRepository
import com.example.localdb.DbWeather
import com.example.networkmodule.retrofit.WeatherMars

class WeatherRepositoryFactoryImpl : WeatherRepositoryFactory {
    override fun createWeatherRepository(
        context: Context,
        weatherDatabase: DbWeather,
        weatherRetrofit: WeatherMars
    ): WeatherRepository {
        return WeatherRepositoryImpl(context, weatherDatabase, weatherRetrofit)
    }
}