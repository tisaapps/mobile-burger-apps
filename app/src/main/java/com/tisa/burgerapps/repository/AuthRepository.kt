package com.tisa.burgerapps.repository

import com.tisa.burgerapps.model.BaseResponse
import com.tisa.burgerapps.model.LoginRequest
import com.tisa.burgerapps.model.LoginResponse
import com.tisa.burgerapps.model.RegisterRequest
import com.tisa.burgerapps.network.ApiService
import com.tisa.burgerapps.network.RetrofitClient

class AuthRepository {

    private val api = RetrofitClient.instance.create(ApiService::class.java)

    suspend fun login(email: String, password: String): LoginResponse {
        return api.login(LoginRequest(email, password))
    }

    suspend fun register(name: String, email: String, password: String): BaseResponse {
        return api.register(RegisterRequest(name, email, password))
    }
}
