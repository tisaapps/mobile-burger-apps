package com.tisa.burgerapps.model

data class OrderItem(
    val name: String,
    val qty: Int,
    val price: Int
)

data class CreateOrderRequest(
    val user_id: Int,
    val items: List<OrderItem>,
    val total_price: Int,
    val delivery_address: String,
    val notes: String?
)

data class OrderResponse(
    val id: Int,
    val name: String,
    val items: List<OrderItem>,
    val total_price: Int,
    val status: String
)
