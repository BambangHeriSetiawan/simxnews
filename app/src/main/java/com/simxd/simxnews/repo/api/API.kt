package com.simxd.simxnews.repo.api

import com.simxd.simxnews.repo.models.ResponseNews
import retrofit2.Response

import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * @Author: Bambang Heri Setiawan
 * @Company: PT. Indoglobal Nusa Persada
 * @Date: 12,August,2022
 */
interface API {
	@Headers("Accept: application/json", "Content-type: application/json")
	@POST("svc/search/v2/articlesearch.json")
	suspend fun news(
		@Query("q") keyword:String?
	): Response<ResponseNews>
	
	object Factory {
		fun build():API {
			return  ApiCore.config().create(API::class.java)
		}
	}
}