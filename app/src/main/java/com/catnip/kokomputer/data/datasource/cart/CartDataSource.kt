package com.catnip.kokomputer.data.datasource.cart

import com.catnip.kokomputer.data.source.local.database.dao.CartDao
import com.catnip.kokomputer.data.source.local.database.entity.CartEntity
import kotlinx.coroutines.flow.Flow

interface CartDataSource {
    fun getAllCarts() : Flow<List<CartEntity>>
    suspend fun insertCart(cartEntity: CartEntity): Long
    suspend fun updateCart(cartEntity: CartEntity): Int
    suspend fun deleteCart(cartEntity: CartEntity): Int
    suspend fun deleteAll()
}

class CartDatabaseDataSource(private val dao: CartDao) : CartDataSource {
    override fun getAllCarts(): Flow<List<CartEntity>> = dao.getAllCarts()
    override suspend fun insertCart(cartEntity: CartEntity): Long = dao.insertCart(cartEntity)
    override suspend fun updateCart(cartEntity: CartEntity): Int  = dao.updateCart(cartEntity)
    override suspend fun deleteCart(cartEntity: CartEntity): Int = dao.deleteCart(cartEntity)
    override suspend fun deleteAll() = dao.deleteAll()
}
