package com.catnip.kokomputer.data.source.local.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.catnip.kokomputer.data.source.local.database.dao.CartDao

@Entity(tableName = "carts")
data class CartEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "food_id")
    var foodId: String? = null,
    @ColumnInfo(name = "food_name")
    var foodName: String,
    @ColumnInfo(name = "food_img_url")
    var foodImgURL: String,
    @ColumnInfo(name = "food_price")
    var foodPrice: Double,
    @ColumnInfo(name = "food_quantity")
    var foodQuantity: Int = 0,
    @ColumnInfo(name = "food_notes")
    var foodNotes: String? = null,
)

