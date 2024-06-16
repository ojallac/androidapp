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
// 里面是各种小吃信息，可以更改为城市
@Immutable
data class Snack(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

/**
 * Static data
 */

val snacks = listOf(
    Snack(
        id = 1L,
        name = "南京市",
        tagline = "古称金陵，建康",
        imageUrl = "https://www.wifi-travel.jp/blog/wp-content/uploads/2021/06/nanjing-tourist-attractions_00.jpg",
    ),
    Snack(
        id = 2L,
        name = "无锡市",
        tagline = "古称梁溪、金匮",
        imageUrl = "https://th.bing.com/th/id/R.2c6f93f619ce88d8f7cbc83eeacb4256?rik=uqB%2bCz2jMGA1Gw&riu=http%3a%2f%2f5b0988e595225.cdn.sohucs.com%2fimages%2f20191110%2f01e6b5a439904ea4b5d02964434c0140.jpeg&ehk=OeC%2f2C9Xoj2bCqniqMDECNopeY9%2bh2gOGoXnHA4dLCI%3d&risl=&pid=ImgRaw&r=0",
    ),
    Snack(
        id = 3L,
        name = "徐州市",
        tagline = "古称逐鹿、彭城",
        imageUrl = "https://tour.jschina.com.cn/lyzx/202003/W020200302315060469663.jpg",
    ),
    Snack(
        id = 4L,
        name = "常州市",
        tagline = "古称延陵",
        imageUrl = "https://tour.jschina.com.cn/lyzx/202008/W020200811310277626151.jpg",
    ),
    Snack(
        id = 5L,
        name = "苏州市",
        tagline = "古称吴，姑苏",
        imageUrl = "https://th.bing.com/th/id/R.3d24edb80cc90e4a25fadb912823e702?rik=OIHMgmK402MzpA&riu=http%3a%2f%2fp8.itc.cn%2fimages01%2f20200928%2ff59430a0dc774e77a4e251108588787d.jpeg&ehk=1htz7PuFQT2zxr0AHJaq3cWNM047rtRTNGvtEDIzhxU%3d&risl=&pid=ImgRaw&r=0",
    ),
    Snack(
        id = 6L,
        name = "南通市",
        tagline = "古称静海",
        imageUrl = "https://th.bing.com/th/id/R.e1cf17ecb8895cabf5575f52fa926850?rik=If4wG%2b%2b5aMfuAg&riu=http%3a%2f%2fwww.nantong.gov.cn%2fntsrmzf%2fupload%2f804ffade-7ff8-449c-9433-ae7ebd83c568.jpg&ehk=d%2fGz4ohbYUwnbdBBme2IU6H8P7d3%2bijzqgS2hKgXCpo%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 7L,
        name = "连云港市",
        tagline = "古称海州、东海",
        imageUrl = "https://th.bing.com/th/id/R.99c4b022747dc15a0ac31d3885e02bf8?rik=J45pYuoC91OA3w&riu=http%3a%2f%2f5b0988e595225.cdn.sohucs.com%2fimages%2f20180116%2f00edb35f6d894c6a8bed6637d4bffb33.jpeg&ehk=UtMF%2bWo4JIvcU%2bkrtni4vxQ73YtRc0TdsRq8asARkFw%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 8L,
        name = "淮安市",
        tagline = "古称淮阴、清江浦",
        imageUrl = "https://th.bing.com/th/id/R.6da8bc82c4cf75172a9c06df7ddc58cd?rik=%2fQ4lfIzvRFs3gw&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd10113%2f399%2fw1269h730%2f20200906%2f2ba6-iytwsca4254167.png&ehk=Cab3UUkSzcEU8ccSVcjJsxgssXor12phO6%2bEalMBPBU%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 9L,
        name = "盐城市",
        tagline = "古称盐渎、瓢城",
        imageUrl = "https://tour.jschina.com.cn/ztk/2020mryj/tpzs/202203/W020220304410302844500.jpg",

    ),
    Snack(
        id = 10L,
        name = "扬州市",
        tagline = "古称广陵、江都",
        imageUrl = "https://th.bing.com/th/id/R.a645cfe6fea6aae3c9856ef6588e5d30?rik=jT75KSgI1qJNyQ&riu=http%3a%2f%2fy0.ifengimg.com%2f52e0de6343af0d30%2f2013%2f1205%2frdn_52a032d59a34a.jpg&ehk=umSaDJqlq1QE9%2bZTA%2bOqfgYku0NJxlqjsd2zuQFQeO8%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 11L,
        name = "镇江市",
        tagline = "古称丹徒、润州",
        imageUrl = "https://th.bing.com/th/id/R.b3a52a429fd0051d524efc6d43e952da?rik=MD5eVLLFsAF5Cg&riu=http%3a%2f%2fgjzx.jschina.com.cn%2f21660%2f202011%2fW020201125349667141894.jpg&ehk=9DEG02fdQtp3s3CpdxFki3pKgdgVaGtJhC5q%2fqXqK9g%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 12L,
        name = "泰州市",
        tagline = "古称海陵",
        imageUrl = "https://tour.jschina.com.cn/ztk/2020mryj/tpzs/202009/W020200916330593668287.jpg",

    ),
    Snack(
        id = 13L,
        name = "宿迁市",
        tagline = "古称宿豫(预)、钟吾",
        imageUrl = "https://travellutionmedia.com/wp-content/uploads/%E5%AE%BF%E8%BF%81%E9%A1%B9%E7%8E%8B%E6%95%85%E9%87%8C.jpg",

    ),
    Snack(
        id = 14L,
        name = "Pie",
        tagline = "A tag line",
        imageUrl = "https://source.unsplash.com/aX_ljOOyWJY",

    ),
    Snack(
        id = 15L,
        name = "南京咸水鹅",
        imageUrl = "https://pic1.zhimg.com/80/v2-76abd6184f562a227fec2fd1cb31ee38_720w.webp",

    ),
    Snack(
        id = 16L,
        name = "黄桥烧饼",
        imageUrl = "https://pic1.zhimg.com/80/v2-4c6e7701fa44f73456413f133f520ad4_720w.webp",

    ),
    Snack(
        id = 17L,
        name = "镇江肴肉",
        imageUrl = "https://pic4.zhimg.com/80/v2-2b581c50b1d80aea6c2469d939d43397_720w.webp",

    ),
    Snack(
        id = 18L,
        name = "鸭血粉丝汤",
        imageUrl = "https://th.bing.com/th/id/R.1f57714c1587d11b6ca50af785a6986b?rik=IbueQjT%2f0uMqnA&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd20210427ac%2f334%2fw1160h774%2f20210427%2fba89-kphwumr4539945.jpg&ehk=26N9HyKSSV2egMsx6%2fhsBTB1innWwHJ3linjQSMFh0Q%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 19L,
        name = "梅花糕",
        imageUrl = "https://th.bing.com/th/id/R.e96954bbc1d944549cce182d8053fa87?rik=d7fJrZ%2b0SXieVg&riu=http%3a%2f%2fn1.itc.cn%2fimg8%2fwb%2frecom%2f2017%2f03%2f03%2f148852120681342426.JPEG&ehk=lv6tF3%2fCDHcdLHjMQQyYw8e5GXDbnrp7eDUiDF24ZYU%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 20L,
        name = "千层油糕",
        imageUrl = "https://cp1.douguo.com/upload/caiku/1/e/4/yuan_1e0db0b4c6266465f6baea0b2da6aaa4.jpeg",

    ),
    Snack(
        id = 21L,
        name = "翡翠烧麦",
        tagline = "A tag line",
        imageUrl = "https://x0.ifengimg.com/res/2021/F8E59AFC114F40825B40FCB28410A2A768D1403A_size120_w1080_h689.jpeg",

    ),
    Snack(
        id = 22L,
        name = "瘦西湖",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/641.jpg",

    ),
    Snack(
        id = 23L,
        name = "夫子庙",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/642.jpg",

    ),
    Snack(
        id = 24L,
        name = "周庄古镇",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/643.jpg",

    ),
    Snack(
        id = 25L,
        name = "同里古镇",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/644.jpg",

    ),
    Snack(
        id = 26L,
        name = "苏州园林",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/646.jpg",

    ),
    Snack(
        id = 27L,
        name = "无锡灵山大佛",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/649.jpg",

    ),
    Snack(
        id = 28L,
        name = "鸡鸣寺",
        imageUrl = "https://img1.qunarzz.com/travel/d7/1611/e8/1d61bfabfc8ddfb5.jpg_r_640x400x70_7dc7fd44.jpg",

    ),
    Snack(
        id = 29L,
        name = "秦淮灯会",
        imageUrl = "https://n.sinaimg.cn/sinacn10120/224/w640h384/20200118/e774-inhcycc1139028.jpg",

    ),
    Snack(
        id = 30L,
        name = "水八鲜",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/264/415/431.jpg",

    ),
    Snack(
        id = 31L,
        name = "南京妈祖庙会",
        imageUrl = "https://th.bing.com/th/id/R.d8694ef6be390dc162351b62c9a9528d?rik=ORdzvJxuEx8kYQ&riu=http%3a%2f%2fy2.ifengimg.com%2f138336048b6d06f8%2f2014%2f0423%2frdn_53577ee02ecec.jpg&ehk=BA4lT2VVPlxW5fHiE5l%2f1QsaKDo25f%2bnpv1fXxIPGhs%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 32L,
        name = "苏州轧神仙",
        imageUrl = "https://th.bing.com/th/id/R.973e28a8fb4fc11a3a2bc431086c6730?rik=ujmdmILwwJYxjw&riu=http%3a%2f%2foss.cloud.jstv.com%2fcdv-yuntonglian_QMTNRK_YUNSHI_P00070605_50FC5C4701A849E38BCCCB35ED4047EE.jpg%3fx-oss-process%3dstyle%2fpaipai&ehk=698424I9tFOT%2bpPVWDKCxaHPP1%2bIbQ00qPo5KiGHo48%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 33L,
        name = "徐州琴书",
        imageUrl = "https://th.bing.com/th/id/R.7be54b082eaa2f512616799bd9e5bb4f?rik=tKiGPioROXk0Zw&riu=http%3a%2f%2fwww.yangqinxi.com%2fd%2ffile%2f2015-10-06%2f80772a401d0d5be0e62401826db45892.jpg&ehk=inurxpCzJJoOIsknzlFEDf%2bmGnX8A%2bsO8sGLWTfEiYM%3d&risl=&pid=ImgRaw&r=0",

    ),
    Snack(
        id = 34L,
        name = "牛首山踏春",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/123/267/168.jpg",
    ),
)
