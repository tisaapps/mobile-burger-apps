package com.tisa.burgerapps.network

import com.tisa.burgerapps.model.BaseResponse
import com.tisa.burgerapps.model.CreateOrderRequest
import com.tisa.burgerapps.model.LoginRequest
import com.tisa.burgerapps.model.LoginResponse
import com.tisa.burgerapps.model.OrderResponse
import com.tisa.burgerapps.model.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    // AUTH
    @POST("api/auth/login.php")
    suspend fun login(
        @Body request: LoginRequest
    ): LoginResponse

    @POST("api/auth/register.php")
    suspend fun register(
        @Body request: RegisterRequest
    ): BaseResponse

    // ORDER
    @POST("api/order/create.php")
    suspend fun createOrder(
        @Body request: CreateOrderRequest
    ): BaseResponse

    @GET("api/order/list.php")
    suspend fun getOrders(): List<OrderResponse>
}
