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
    val tags: Set<String> = emptySet(),
    val detail: String = "",
    val kind: String = "",
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
        detail = "南京市，古称金陵、建康，是江苏省辖地级市、省会、副省级市、特大城市、南京都市圈核心城市，国务院批复确定的中国东部地区重要的中心城市、全国重要的科研教育基地和综合交通枢纽。\n" +
                "\n" +
                "截至2023年8月，南京市辖11个区，总面积6587.04平方千米，建成区面积868.28平方千米。2023年末，南京市常住人口954.70万人1。南京市地处中国东部、长江下游、濒江近海，是中国人民解放军东部战区司令部驻地，国务院规划定位的长三角辐射带动中西部地区发展的重要门户城市和东部沿海经济带与长江经济带战略交汇的重要节点城市。\n" +
                "\n" +
                "南京市是首批国家历史文化名城，中华文明的重要发祥地，长期是中国南方的政治、经济、文化中心。南京在35~60万年前已有南京猿人在汤山生活，有7000多年文明史，3100多年建城史和近500年的建都史，长干古城的发掘将南京建城史向前推至3100多年前的商代晚期。\n" +
                "\n" +
                "南京市是国家重要的科教中心，自古以来就是一座崇文重教的城市，有“天下文枢”“东南第一学”之称，明清中国一半以上的状元均出自南京江南贡院。截至2022年，南京有各类高等院校68所，其中双一流高校13所、111计划高校10所、211高校8所、两院院士97人，均仅次于北京上海；2023自然指数—科研城市排名，南京位列全球第6、中国第3。2023年，南京市地区生产总值17421.40亿元，按不变价格计算，比上年增长4.6%。",
        kind = "热门城市"
    ),
    Snack(
        id = 2L,
        name = "无锡市",
        tagline = "古称梁溪、金匮",
        imageUrl = "https://th.bing.com/th/id/R.2c6f93f619ce88d8f7cbc83eeacb4256?rik=uqB%2bCz2jMGA1Gw&riu=http%3a%2f%2f5b0988e595225.cdn.sohucs.com%2fimages%2f20191110%2f01e6b5a439904ea4b5d02964434c0140.jpeg&ehk=OeC%2f2C9Xoj2bCqniqMDECNopeY9%2bh2gOGoXnHA4dLCI%3d&risl=&pid=ImgRaw&r=0",
        detail = "无锡市，古称梁溪、金匮，位于江苏省南部，是长江三角洲重要的中心城市之一。无锡市以其美丽的太湖景色和丰富的历史文化遗产而著名。\n" +
                "\n" +
                "无锡市辖7个区，总面积4628.47平方公里，2023年末常住人口约为650万人。无锡市自古以来就是商贸重镇和文化名城，拥有众多的古代建筑和名胜古迹，如无锡古运河、鼋头渚、灵山大佛等。\n" +
                "\n" +
                "无锡市是中国重要的工业城市，特别是轻工业和现代制造业发达，拥有众多高科技企业和科研机构。同时，无锡市也是全国知名的教育和科研中心，拥有多所著名高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 3L,
        name = "徐州市",
        tagline = "古称逐鹿、彭城",
        imageUrl = "https://tour.jschina.com.cn/lyzx/202003/W020200302315060469663.jpg",
        detail = "徐州市，古称逐鹿、彭城，位于江苏省西北部，是江苏省重要的工业城市和交通枢纽。\n" +
                "\n" +
                "徐州市辖6个区和3个县，总面积11258平方公里，2023年末常住人口约为850万人。徐州以其悠久的历史和文化而著名，是中国历史文化名城之一，拥有丰富的文物古迹，如云龙湖、彭祖园、汉文化景区等。\n" +
                "\n" +
                "徐州市是中国重要的煤炭工业基地，同时也是现代制造业和高新技术产业的聚集地。徐州的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 4L,
        name = "常州市",
        tagline = "古称延陵",
        imageUrl = "https://tour.jschina.com.cn/lyzx/202008/W020200811310277626151.jpg",
        detail = "常州市，古称延陵，位于江苏省南部，是长江三角洲重要的中心城市之一。\n" +
                "\n" +
                "常州市辖5个区，总面积4376平方公里，2023年末常住人口约为500万人。常州以其悠久的历史和丰富的文化遗产而著名，拥有众多的历史古迹和名胜风景，如天宁寺、恐龙园、红梅公园等。\n" +
                "\n" +
                "常州市是中国重要的制造业基地，特别是装备制造业和高新技术产业发达。常州的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 5L,
        name = "苏州市",
        tagline = "古称吴，姑苏",
        imageUrl = "https://th.bing.com/th/id/R.3d24edb80cc90e4a25fadb912823e702?rik=OIHMgmK402MzpA&riu=http%3a%2f%2fp8.itc.cn%2fimages01%2f20200928%2ff59430a0dc774e77a4e251108588787d.jpeg&ehk=1htz7PuFQT2zxr0AHJaq3cWNM047rtRTNGvtEDIzhxU%3d&risl=&pid=ImgRaw&r=0",
        detail = "苏州市，古称吴、姑苏，位于江苏省东南部，是长江三角洲重要的中心城市之一。\n" +
                "\n" +
                "苏州市辖5个区和4个县级市，总面积8488平方公里，2023年末常住人口约为1300万人。苏州以其美丽的古典园林和悠久的历史文化而著名，是中国首批国家历史文化名城之一，拥有众多的文化遗产和旅游景点，如拙政园、留园、虎丘等。\n" +
                "\n" +
                "苏州市是中国重要的经济和科技中心，特别是高新技术产业和现代服务业发达。苏州的教育和科研实力也较为雄厚，拥有多所著名高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 6L,
        name = "南通市",
        tagline = "古称静海",
        imageUrl = "https://th.bing.com/th/id/R.e1cf17ecb8895cabf5575f52fa926850?rik=If4wG%2b%2b5aMfuAg&riu=http%3a%2f%2fwww.nantong.gov.cn%2fntsrmzf%2fupload%2f804ffade-7ff8-449c-9433-ae7ebd83c568.jpg&ehk=d%2fGz4ohbYUwnbdBBme2IU6H8P7d3%2bijzqgS2hKgXCpo%3d&risl=&pid=ImgRaw&r=0",
        detail = "南通市，古称静海，位于江苏省东部，是长江三角洲重要的中心城市之一。\n" +
                "\n" +
                "南通市辖7个区，总面积8001平方公里，2023年末常住人口约为760万人。南通以其独特的地理位置和丰富的历史文化而著名，拥有众多的历史古迹和旅游景点，如狼山、南通博物苑、濠河等。\n" +
                "\n" +
                "南通市是中国重要的现代制造业和港口城市，特别是船舶制造业和纺织业发达。南通的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 7L,
        name = "连云港市",
        tagline = "简称连，古称海州",
        imageUrl = "https://th.bing.com/th/id/R.99c4b022747dc15a0ac31d3885e02bf8?rik=J45pYuoC91OA3w&riu=http%3a%2f%2f5b0988e595225.cdn.sohucs.com%2fimages%2f20180116%2f00edb35f6d894c6a8bed6637d4bffb33.jpeg&ehk=UtMF%2bWo4JIvcU%2bkrtni4vxQ73YtRc0TdsRq8asARkFw%3d&risl=&pid=ImgRaw&r=0",
        detail = "连云港市，简称连，古称海州，位于江苏省东北部，是江苏省重要的港口城市和交通枢纽。\n" +
                "\n" +
                "连云港市辖6个区，总面积7617平方公里，2023年末常住人口约为500万人。连云港以其独特的地理位置和丰富的历史文化而著名，拥有众多的历史古迹和旅游景点，如花果山、连岛、渔湾等。\n" +
                "\n" +
                "连云港市是中国重要的现代港口和工业城市，特别是港口物流业和石化产业发达。连云港的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 8L,
        name = "淮安市",
        tagline = "古称清河、淮阴",
        imageUrl = "https://th.bing.com/th/id/R.6da8bc82c4cf75172a9c06df7ddc58cd?rik=%2fQ4lfIzvRFs3gw&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd10113%2f399%2fw1269h730%2f20200906%2f2ba6-iytwsca4254167.png&ehk=Cab3UUkSzcEU8ccSVcjJsxgssXor12phO6%2bEalMBPBU%3d&risl=&pid=ImgRaw&r=0",
        detail = "淮安市，古称清河、淮阴，位于江苏省北部，是江苏省重要的历史文化名城和交通枢纽。\n" +
                "\n" +
                "淮安市辖7个区，总面积10072平方公里，2023年末常住人口约为470万人。淮安以其悠久的历史和丰富的文化遗产而著名，拥有众多的历史古迹和旅游景点，如周恩来故居、淮安府署、洪泽湖等。\n" +
                "\n" +
                "淮安市是中国重要的农副产品生产基地，同时也是现代制造业和高新技术产业的聚集地。淮安的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 9L,
        name = "盐城市",
        tagline = "古称射阳",
        imageUrl = "https://tour.jschina.com.cn/ztk/2020mryj/tpzs/202203/W020220304410302844500.jpg",
        detail = "盐城市，古称射阳，位于江苏省中部，是江苏省重要的农业和渔业基地。\n" +
                "\n" +
                "盐城市辖9个区，总面积16931平方公里，2023年末常住人口约为730万人。盐城以其悠久的历史和丰富的自然资源而著名，拥有众多的历史古迹和旅游景点，如大纵湖、盐城湿地公园、盐镇水街等。\n" +
                "\n" +
                "盐城市是中国重要的农业和渔业生产基地，同时也是现代制造业和高新技术产业的聚集地。盐城的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 10L,
        name = "扬州市",
        tagline = "简称扬，古称广陵、江都",
        imageUrl = "https://th.bing.com/th/id/R.a645cfe6fea6aae3c9856ef6588e5d30?rik=jT75KSgI1qJNyQ&riu=http%3a%2f%2fy0.ifengimg.com%2f52e0de6343af0d30%2f2013%2f1205%2frdn_52a032d59a34a.jpg&ehk=umSaDJqlq1QE9%2bZTA%2bOqfgYku0NJxlqjsd2zuQFQeO8%3d&risl=&pid=ImgRaw&r=0",
        detail = "扬州市，简称扬，古称广陵、江都，位于江苏省中部，是江苏省重要的历史文化名城和旅游胜地。\n" +
                "\n" +
                "扬州市辖7个区，总面积6591平方公里，2023年末常住人口约为450万人。扬州以其悠久的历史和丰富的文化遗产而著名，拥有众多的历史古迹和旅游景点，如瘦西湖、个园、大明寺等。\n" +
                "\n" +
                "扬州市是中国重要的文化旅游城市，同时也是现代制造业和高新技术产业的聚集地。扬州的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 11L,
        name = "镇江市",
        tagline = "古称京口、润州",
        imageUrl = "https://th.bing.com/th/id/R.b3a52a429fd0051d524efc6d43e952da?rik=MD5eVLLFsAF5Cg&riu=http%3a%2f%2fgjzx.jschina.com.cn%2f21660%2f202011%2fW020201125349667141894.jpg&ehk=9DEG02fdQtp3s3CpdxFki3pKgdgVaGtJhC5q%2fqXqK9g%3d&risl=&pid=ImgRaw&r=0",
        detail = "镇江市，古称京口、润州，位于江苏省南部，是江苏省重要的历史文化名城和交通枢纽。\n" +
                "\n" +
                "镇江市辖5个区，总面积3842平方公里，2023年末常住人口约为320万人。镇江以其悠久的历史和丰富的文化遗产而著名，拥有众多的历史古迹和旅游景点，如金山寺、焦山、北固山等。\n" +
                "\n" +
                "镇江市是中国重要的现代制造业和高新技术产业基地，同时也是长江经济带的重要节点城市。镇江的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 12L,
        name = "泰州市",
        tagline = "古称海陵",
        imageUrl = "https://tour.jschina.com.cn/ztk/2020mryj/tpzs/202009/W020200916330593668287.jpg",
        detail = "泰州市，古称海陵，位于江苏省中部，是江苏省重要的历史文化名城和交通枢纽。\n" +
                "\n" +
                "泰州市辖6个区，总面积5793平方公里，2023年末常住人口约为480万人。泰州以其悠久的历史和丰富的文化遗产而著名，拥有众多的历史古迹和旅游景点，如凤城河、泰州古城、泰山寺等。\n" +
                "\n" +
                "泰州市是中国重要的现代制造业和高新技术产业基地，同时也是长江经济带的重要节点城市。泰州的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 13L,
        name = "宿迁市",
        tagline = "古称宿预、下相",
        imageUrl = "https://travellutionmedia.com/wp-content/uploads/%E5%AE%BF%E8%BF%81%E9%A1%B9%E7%8E%8B%E6%95%85%E9%87%8C.jpg",
        detail = "宿迁市，古称宿预、下相，位于江苏省北部，是江苏省重要的新兴城市和交通枢纽。\n" +
                "\n" +
                "宿迁市辖6个区，总面积8555平方公里，2023年末常住人口约为570万人。宿迁以其丰富的自然资源和快速发展的城市建设而著名，拥有众多的历史古迹和旅游景点，如项王故里、骆马湖、三台山森林公园等。\n" +
                "\n" +
                "宿迁市是中国重要的现代制造业和高新技术产业基地，同时也是长江经济带的重要节点城市。宿迁的教育和科研实力也较为雄厚，拥有多所高等院校和科研机构。",
        kind = "热门城市"
    ),
    Snack(
        id = 14L,
        name = "南京咸水鹅副本",
        imageUrl = "https://pic1.zhimg.com/80/v2-76abd6184f562a227fec2fd1cb31ee38_720w.webp",
        detail = "南京咸水鹅是江苏南京的传统小吃，以鲜咸可口而闻名。制作时选用肥美鹅肉，配以咸蛋黄、葱姜蒜末等调料，再加入秘制的酱汁，经过多道工序精心烹制而成。口感鲜咸丰富，是南京不可忽视的地方美食之一。",
        kind = "知名小吃"
    ),
    Snack(
        id = 15L,
        name = "南京咸水鹅",
        imageUrl = "https://pic1.zhimg.com/80/v2-76abd6184f562a227fec2fd1cb31ee38_720w.webp",
        detail = "南京咸水鹅是江苏南京的传统小吃，以鲜咸可口而闻名。制作时选用肥美鹅肉，配以咸蛋黄、葱姜蒜末等调料，再加入秘制的酱汁，经过多道工序精心烹制而成。口感鲜咸丰富，是南京不可忽视的地方美食之一。",
        kind = "知名小吃"
    ),

    Snack(
        id = 16L,
        name = "黄桥烧饼",
        imageUrl = "https://pic1.zhimg.com/80/v2-4c6e7701fa44f73456413f133f520ad4_720w.webp",
        detail = "黄桥烧饼源自江苏省苏州市黄桥镇，是一种传统的特色糕点。其以酥脆的外皮和软糯的内馅著称，内馅多为豆沙、芝麻等，口感丰富。黄桥烧饼的制作历史悠久，技艺精湛，是苏州地区不可或缺的地方小吃之一。",
        kind = "知名小吃"
    ),

    Snack(
        id = 17L,
        name = "镇江肴肉",
        imageUrl = "https://pic4.zhimg.com/80/v2-2b581c50b1d80aea6c2469d939d43397_720w.webp",
        detail = "镇江肴肉是江苏省镇江市的传统名菜之一，以肉质鲜嫩、口感醇香而著称。选用优质猪肉，经过精心腌制和独特烹制工艺，使其入味鲜美，香气扑鼻。镇江肴肉不仅是地方美食的代表之一，也是镇江地方特色餐。",
        kind = "知名小吃"
    ),

    Snack(
        id = 18L,
        name = "鸭血粉丝汤",
        imageUrl = "https://th.bing.com/th/id/R.1f57714c1587d11b6ca50af785a6986b?rik=IbueQjT%2f0uMqnA&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd20210427ac%2f334%2fw1160h774%2f20210427%2fba89-kphwumr4539945.jpg&ehk=26N9HyKSSV2egMsx6%2fhsBTB1innWwHJ3linjQSMFh0Q%3d&risl=&pid=ImgRaw&r=0",
        detail = "鸭血粉丝汤是一道江苏地方特色美食，以鸭血、粉丝为主要材料，加上鲜美的鸭肉和精心调制的高汤，烹制而成。汤色鲜亮，口感醇厚，鸭血富含营养，粉丝软糯可口。是南京地区广受欢迎的传统汤品之一。",
        kind = "知名小吃"
    ),

    Snack(
        id = 19L,
        name = "梅花糕",
        imageUrl = "https://th.bing.com/th/id/R.e96954bbc1d944549cce182d8053fa87?rik=d7fJrZ%2b0SXieVg&riu=http%3a%2f%2fn1.itc.cn%2fimg8%2fwb%2frecom%2f2017%2f03%2f03%2f148852120681342426.JPEG&ehk=lv6tF3%2fCDHcdLHjMQQyYw8e5GXDbnrp7eDUiDF24ZYU%3d&risl=&pid=ImgRaw&r=0",
        detail = "梅花糕是一种以糯米粉、红豆等为主要原料制作的传统糕点。其形状如梅花，质地绵软，口感香甜，营养丰富。梅花糕在南京地区有着悠久的历史，是节庆、喜庆时必备的美食之一，也是南京文化的重要组成部分。",
        kind = "知名小吃"
    ),

    Snack(
        id = 20L,
        name = "千层油糕",
        imageUrl = "https://cp1.douguo.com/upload/caiku/1/e/4/yuan_1e0db0b4c6266465f6baea0b2da6aaa4.jpeg",
        detail = "千层油糕是江苏地方特色小吃之一，以其多层次、酥软可口而著称。主要原料为面粉、猪油和糖等，制作时通过多次摊叠、揉搓、拉扯等工序，使得糕体层次分明，口感丰富。千层油糕在南京及周边地区广受欢迎，是一道具有代表性的地方美食。",
        kind = "知名小吃"
    ),

    Snack(
        id = 21L,
        name = "翡翠烧麦",
        tagline = "A tag line",
        imageUrl = "https://x0.ifengimg.com/res/2021/F8E59AFC114F40825B40FCB28410A2A768D1403A_size120_w1080_h689.jpeg",
        detail = "翡翠烧麦是一种以鲜肉、虾仁等为馅料，外皮薄而韧、透明如翡翠的江苏特色小吃。其制作精细，馅料鲜嫩，口感丰富。翡翠烧麦在南京及长三角地区广受欢迎，是地方美食中的一大特色。",
        kind = "知名小吃"
    ),

    Snack(
        id = 22L,
        name = "瘦西湖",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/641.jpg",
        detail = "瘦西湖，位于江苏省扬州市城西，是中国著名的园林风景区之一。瘦西湖风景区总面积约2000亩，湖区错落有致，水面宽阔，景点众多。瘦西湖以其精致的园林布局和富有文化底蕴的历史遗迹而闻名，是扬州市的地标性景点之一。",
        kind = "旅游景点"
    ),
    Snack(
        id = 23L,
        name = "夫子庙",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/642.jpg",
        detail = "夫子庙，位于江苏省南京市秦淮区夫子庙街道，是中国著名的文教区和旅游景区。夫子庙始建于南朝时期，历经多次修缮和扩建，成为南京地区最具规模和影响力的古建筑群之一。夫子庙以其深厚的文化底蕴和丰富的历史遗迹而闻名，是中国文化教育名城南京的重要象征之一。每年的传统文化节庙会吸引了大量游客和文化爱好者前来参观和交流。",
        kind = "旅游景点"
    ),
    Snack(
        id = 24L,
        name = "周庄古镇",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/643.jpg",
        detail = "周庄古镇，位于江苏省苏州市昆山市境内，是中国江南地区著名的水乡古镇之一。周庄始建于宋元时期，是一座保存完整的江南水乡古镇，以其独特的水上民居建筑风格和古朴的水乡生活文化而著称。周庄古镇景区面积约50万平方米，是游览江南水乡风光、体验传统文化的理想去处。",
        kind = "旅游景点"
    ),

    Snack(
        id = 25L,
        name = "同里古镇",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/644.jpg",
        detail = "同里古镇，位于江苏省苏州市吴江区境内，是中国江南著名的历史文化名镇之一。同里古镇建于五代时期，历经千年沧桑，保留了大量明清时期的古建筑和传统民俗风情。同里古镇以其独特的水乡风光和悠久的历史文化而著称，是游客探寻江南古镇韵味的重要景点。",
        kind = "旅游景点"
    ),

    Snack(
        id = 26L,
        name = "苏州园林",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/646.jpg",
        detail = "苏州园林是中国传统园林艺术的重要代表，被誉为“天下园林之盛”，是世界文化遗产。苏州园林兴起于春秋战国时期，历经宋、元、明、清各朝，形成了以布局精致、造景巧妙、意境深远为特点的苏州园林风格。苏州园林不仅具有高度的艺术价值，还是中国文化的重要代表之一。",
        kind = "旅游景点"
    ),

    Snack(
        id = 27L,
        name = "无锡灵山大佛",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/270/470/649.jpg",
        detail = "无锡灵山大佛，位于江苏省无锡市滨湖区灵山景区内，是中国最大的青铜佛像之一。灵山大佛始建于唐代，距今已有千年历史，是中国现存最古老、最大的青铜佛像之一，也是无锡市的著名地标。灵山大佛景区不仅以其宏伟的佛像而闻名，还有着丰富的佛教文化内涵和美丽的自然风光，是游客朝圣、参禅修行的重要场所。",
        kind = "旅游景点"
    ),

    Snack(
        id = 28L,
        name = "鸡鸣寺",
        imageUrl = "https://img1.qunarzz.com/travel/d7/1611/e8/1d61bfabfc8ddfb5.jpg_r_640x400x70_7dc7fd44.jpg",
        detail = "鸡鸣寺，位于江苏省南京市玄武区鸡笼山上，是中国历史悠久的佛教寺庙之一。鸡鸣寺创建于东晋时期，至今已有千余年历史，是南京市最古老的佛教寺庙之一，也是中国佛教传统文化的重要代表之一。鸡鸣寺不仅以其古老的建筑和深厚的宗教文化内涵而著称，还是南京市重要的旅游景点之一。",
        kind = "旅游景点"
    ),

    Snack(
        id = 29L,
        name = "秦淮灯会",
        imageUrl = "https://n.sinaimg.cn/sinacn10120/224/w640h384/20200118/e774-inhcycc1139028.jpg",
        detail = "秦淮灯会，位于江苏省南京市秦淮区夫子庙景区，是中国南方最盛大的传统民俗文化节庆之一。秦淮灯会起源于宋代，历经千年发展，至今已有数百年历史，是中国灯会文化的代表性活动。秦淮灯会不仅以其独特的灯饰艺术和丰富的民俗表演而著称，还是南京市的重要文化品牌和旅游名片之一。",
        kind = "风俗习惯"
    ),

    Snack(
        id = 30L,
        name = "水八鲜",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/264/415/431.jpg",
        detail = "水八鲜是江苏地方特色菜肴，源自苏北地区。其主要原料为水产品，如鲜鱼、虾仁、蟹肉等，通过精心烹制，制成一道鲜美可口的菜肴。水八鲜以其原汁原味、清爽鲜美而著称，是苏北地区的地方名菜之一，也是江苏省的特色美食。",
        kind = "风俗习惯"
    ),

    Snack(
        id = 31L,
        name = "南京妈祖庙会",
        imageUrl = "https://th.bing.com/th/id/R.d8694ef6be390dc162351b62c9a9528d?rik=ORdzvJxuEx8kYQ&riu=http%3a%2f%2fy2.ifengimg.com%2f138336048b6d06f8%2f2014%2f0423%2frdn_53577ee02ecec.jpg&ehk=BA4lT2VVPlxW5fHiE5l%2f1QsaKDo25f%2bnpv1fXxIPGhs%3d&risl=&pid=ImgRaw&r=0",
        detail = "南京妈祖庙会，是中国南方地区重要的传统宗教庙会之一，也是南京市的著名民俗文化节庆。妈祖庙会起源于明代，历经数百年发展，是为纪念中国古代航海女神妈祖而设的大型庙会。南京妈祖庙会以其盛大的规模、丰富的民俗表演和传统的宗教活动而著称，每年吸引数以万计的信徒和游客前来参与。",
        kind = "风俗习惯"
    ),
    Snack(
        id = 32L,
        name = "苏州轧神仙",
        imageUrl = "https://th.bing.com/th/id/R.973e28a8fb4fc11a3a2bc431086c6730?rik=ujmdmILwwJYxjw&riu=http%3a%2f%2foss.cloud.jstv.com%2fcdv-yuntonglian_QMTNRK_YUNSHI_P00070605_50FC5C4701A849E38BCCCB35ED4047EE.jpg%3fx-oss-process%3dstyle%2fpaipai&ehk=698424I9tFOT%2bpPVWDKCxaHPP1%2bIbQ00qPo5KiGHo48%3d&risl=&pid=ImgRaw&r=0",
        detail = "苏州轧神仙，又称苏州神仙果，是江苏省苏州市的一种传统文化习俗。每年农历正月初九（即神仙节），苏州人会制作神仙果并摆放在神仙桥上祭祀。神仙果象征着吉祥和幸福，传说吃了神仙果可以增长寿命。制作神仙果需要严格的工艺和技巧，外皮酥脆，内馅丰富，是苏州春节传统美食的重要代表之一。神仙桥上的神仙果祭祀活动，吸引了许多市民和游客前来观赏，也成为苏州春节文化活动中不可或缺的一部分。",
        kind = "风俗习惯"
    ),
    Snack(
        id = 33L,
        name = "徐州琴书",
        imageUrl = "https://th.bing.com/th/id/R.7be54b082eaa2f512616799bd9e5bb4f?rik=tKiGPioROXk0Zw&riu=http%3a%2f%2fwww.yangqinxi.com%2fd%2ffile%2f2015-10-06%2f80772a401d0d5be0e62401826db45892.jpg&ehk=inurxpCzJJoOIsknzlFEDf%2bmGnX8A%2bsO8sGLWTfEiYM%3d&risl=&pid=ImgRaw&r=0",
        detail = "徐州琴书，又称徐州古琴书画，是江苏地方传统艺术之一，起源于宋代，兴盛于明清时期。徐州琴书结合了古琴演奏和国画绘画，以其高雅的艺术风格和深厚的文化内涵而著称。徐州琴书不仅是徐州地区的重要文化遗产，还是中国文化艺术的重要代表之一。",
        kind = "风俗习惯"
    ),

    Snack(
        id = 34L,
        name = "牛首山踏春",
        imageUrl = "https://imagepphcloud.thepaper.cn/pph/image/123/267/168.jpg",
        detail = "牛首山踏春，位于江苏省南京市浦口区境内，是春季踏青赏花的理想场所之一。牛首山以其宜人的自然景观和丰富的文化底蕴而著称，山上有牛首山寺、明孝陵、灵谷寺等著名景点。每年春季，数以万计的游客慕名而来，体验踏青赏花的乐趣，是南京市春季旅游的重要景点之一。",
        kind = "风俗习惯"
    ),
)
