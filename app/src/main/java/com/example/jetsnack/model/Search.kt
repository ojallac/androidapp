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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

/**
 * A fake repo for searching.
 */
object SearchRepo {
    fun getCategories(): List<SearchCategoryCollection> = searchCategoryCollections
    fun getSuggestions(): List<SearchSuggestionGroup> = searchSuggestions

    suspend fun search(query: String): List<Snack> = withContext(Dispatchers.Default) {
        delay(200L) // simulate an I/O delay
        snacks.filter { it.name.contains(query, ignoreCase = true) }
    }
}

@Immutable
data class SearchCategoryCollection(
    val id: Long,
    val name: String,
    val categories: List<SearchCategory>
)

@Immutable
data class SearchCategory(
    val name: String,
    val imageUrl: String
)

@Immutable
data class SearchSuggestionGroup(
    val id: Long,
    val name: String,
    val suggestions: List<String>
)

/**
 * Static data
 */

private val searchCategoryCollections = listOf(
    SearchCategoryCollection(
        id = 0L,
        name = "推荐城市",
        categories = listOf(
            SearchCategory(
                name = "南京市",
                imageUrl = "https://www.wifi-travel.jp/blog/wp-content/uploads/2021/06/nanjing-tourist-attractions_00.jpg"
            ),
            SearchCategory(
                name = "扬州市",
                imageUrl = "https://th.bing.com/th/id/R.a645cfe6fea6aae3c9856ef6588e5d30?rik=jT75KSgI1qJNyQ&riu=http%3a%2f%2fy0.ifengimg.com%2f52e0de6343af0d30%2f2013%2f1205%2frdn_52a032d59a34a.jpg&ehk=umSaDJqlq1QE9%2bZTA%2bOqfgYku0NJxlqjsd2zuQFQeO8%3d&risl=&pid=ImgRaw&r=0"
            ),
            SearchCategory(
                name = "镇江市",
                imageUrl = "https://th.bing.com/th/id/R.b3a52a429fd0051d524efc6d43e952da?rik=MD5eVLLFsAF5Cg&riu=http%3a%2f%2fgjzx.jschina.com.cn%2f21660%2f202011%2fW020201125349667141894.jpg&ehk=9DEG02fdQtp3s3CpdxFki3pKgdgVaGtJhC5q%2fqXqK9g%3d&risl=&pid=ImgRaw&r=0"
            ),
            SearchCategory(
                name = "徐州市",
                imageUrl = "https://tour.jschina.com.cn/lyzx/202003/W020200302315060469663.jpg"
            )
        )
    ),
    SearchCategoryCollection(
        id = 1L,
        name = "推荐美食",
        categories = listOf(
            SearchCategory(
                name = "鸭血粉丝汤",
                imageUrl = "https://th.bing.com/th/id/R.1f57714c1587d11b6ca50af785a6986b?rik=IbueQjT%2f0uMqnA&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd20210427ac%2f334%2fw1160h774%2f20210427%2fba89-kphwumr4539945.jpg&ehk=26N9HyKSSV2egMsx6%2fhsBTB1innWwHJ3linjQSMFh0Q%3d&risl=&pid=ImgRaw&r=0"
            ),
            SearchCategory(
                name = "梅花糕",
                imageUrl = "https://th.bing.com/th/id/R.e96954bbc1d944549cce182d8053fa87?rik=d7fJrZ%2b0SXieVg&riu=http%3a%2f%2fn1.itc.cn%2fimg8%2fwb%2frecom%2f2017%2f03%2f03%2f148852120681342426.JPEG&ehk=lv6tF3%2fCDHcdLHjMQQyYw8e5GXDbnrp7eDUiDF24ZYU%3d&risl=&pid=ImgRaw&r=0"
            ),
            SearchCategory(
                name = "千层油糕",
                imageUrl = "https://cp1.douguo.com/upload/caiku/1/e/4/yuan_1e0db0b4c6266465f6baea0b2da6aaa4.jpeg"
            ),
            SearchCategory(
                name = "南京咸水鸭",
                imageUrl = "https://pic1.zhimg.com/80/v2-76abd6184f562a227fec2fd1cb31ee38_720w.webp"
            ),
            SearchCategory(
                name = "黄桥烧饼",
                imageUrl = "https://pic1.zhimg.com/80/v2-4c6e7701fa44f73456413f133f520ad4_720w.webp"
            ),
            SearchCategory(
                name = "镇江肴肉",
                imageUrl = "https://pic4.zhimg.com/80/v2-2b581c50b1d80aea6c2469d939d43397_720w.webp"
            )
        )
    )
)

private val searchSuggestions = listOf(
    SearchSuggestionGroup(
        id = 0L,
        name = "最近搜索",
        suggestions = listOf(
            "南京市",
            "徐州琴书"
        )
    ),
    SearchSuggestionGroup(
        id = 1L,
        name = "热门搜索",
        suggestions = listOf(
            "瘦西湖",
            "翡翠烧麦",
            "无锡市",
            "夫子庙",
            "秦淮灯会",
        )
    )
)
