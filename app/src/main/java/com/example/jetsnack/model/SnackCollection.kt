/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetsnack.model

import androidx.compose.runtime.Immutable

@Immutable
data class SnackCollection(
    val id: Long,
    val name: String,
    val snacks: List<Snack>,
    val type: CollectionType = CollectionType.Normal
)

enum class CollectionType { Normal, Highlight }

/**
 * A fake repo
 */
object SnackRepo {
    fun getSnacks(): List<SnackCollection> = snackCollections
    fun getSnack(snackId: Long) = snacks.find { it.id == snackId }!!
    fun getRelated(@Suppress("UNUSED_PARAMETER") snackId: Long) = related
    fun getInspiredByCart() = inspiredByCart
    fun getFilters() = filters
    fun getPriceFilters() = priceFilters
    fun getCart() = cart
    fun getSortFilters() = sortFilters
    fun getCategoryFilters() = categoryFilters
    fun getSortDefault() = sortDefault
    fun getLifeStyleFilters() = lifeStyleFilters
    fun addToCart(snackId: Long, count: Int): Boolean {
        // 将新的OrderLine对象添加到购物车
        val snack = getSnack(snackId)  // 获取指定ID的零食
        val existingOrderLine = cart.find { it.snack.id == snackId }  // 查找购物车中是否已经有这个零食

        if (existingOrderLine == null) {
            // 如果购物车中没有这个零食，就创建一个新的OrderLine对象并添加到购物车
            val orderLine = OrderLine(snack, count)
            cart.add(orderLine)
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Static data
 */

private val tastyTreats = SnackCollection(
    id = 1L,
    name = "热门城市",
    type = CollectionType.Highlight,
    snacks = snacks.subList(0, 13)
)

private val popular = SnackCollection(
    id = 2L,
    name = "知名小吃",
    snacks = snacks.subList(14, 21)
)

private val wfhFavs = tastyTreats.copy(
    id = 3L,
    name = "热门景点",
    snacks = snacks.subList(21, 28)
)

private val newlyAdded = popular.copy(
    id = 4L,
    name = "人文风俗",
    snacks = snacks.subList(28, 34)
)

//private val exclusive = tastyTreats.copy(
//    id = 5L,
//    name = "非遗文化"
//)

private val also = tastyTreats.copy(
    id = 6L,
    name = "Customers also bought"
)
//
private val inspiredByCart = tastyTreats.copy(
    id = 7L,
    name = "猜你喜欢"
)

private val snackCollections = listOf(
    tastyTreats,
    popular,
    wfhFavs,
    newlyAdded,
//    exclusive
)

private val related = listOf(
    also,
    popular
)

private val cart = mutableListOf<OrderLine>(
    OrderLine(snacks[4], 2),
    OrderLine(snacks[6], 3),
    OrderLine(snacks[8], 1)
)

@Immutable
data class OrderLine(
    val snack: Snack,
    val count: Int
)
