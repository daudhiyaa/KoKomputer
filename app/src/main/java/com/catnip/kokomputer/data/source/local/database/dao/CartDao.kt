package com.catnip.kokomputer.data.source.local.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.catnip.kokomputer.data.source.local.database.entity.CartEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CartDao {
    @Query("SELECT * FROM carts")
    fun getAllCarts() : Flow<List<CartEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCart(cartEntity: CartEntity): Long

    @Update
    suspend fun updateCart(cartEntity: CartEntity): Int

    @Delete
    suspend fun deleteCart(cartEntity: CartEntity): Int

    @Query("DELETE FROM carts")
    suspend fun deleteAll()
}