package com.tisa.burgerapps.model

data class LoginRequest(
    val email: String,
    val password: String
)

data class LoginResponse(
    val status: Boolean,
    val user_id: Int,
    val name: String,
    val role: String
)

data class RegisterRequest(
    val name: String,
    val email: String,
    val password: String
)
