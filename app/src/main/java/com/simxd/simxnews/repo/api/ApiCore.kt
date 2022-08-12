package com.simxd.simxnews.repo.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.simxd.simxnews.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @Author: Bambang Heri Setiawan
 * @Company: PT. Indoglobal Nusa Persada
 * @Date: 12,August,2022
 */
object ApiCore {
	private var baseUrl ="https://api.nytimes.com/"
	private var apiKey ="9GdUAJca8UvPq4bfJEOOgPxRi3sZhjB2"
	
	fun config(): Retrofit {
		return Retrofit.Builder().baseUrl(baseUrl)
			.client(client)
			.addConverterFactory(GsonConverterFactory.create(gson))
			.build()
	}
	
	private val gson:Gson = GsonBuilder().serializeNulls().setPrettyPrinting().create()
	
	private val client:OkHttpClient = OkHttpClient.Builder()
		.connectTimeout(60, TimeUnit.SECONDS)
		.readTimeout(60, TimeUnit.SECONDS)
		.retryOnConnectionFailure(retryOnConnectionFailure = true)
		.addInterceptor(interceptor = customInterception())
		.build()
	
	private fun customInterception(): HttpLoggingInterceptor {
		return if (BuildConfig.DEBUG) HttpLoggingInterceptor().setLevel(level = HttpLoggingInterceptor.Level.BODY) else HttpLoggingInterceptor().setLevel(level = HttpLoggingInterceptor.Level.NONE)
	}
}