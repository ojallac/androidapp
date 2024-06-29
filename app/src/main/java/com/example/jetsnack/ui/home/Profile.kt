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

package com.example.jetsnack.ui.home

import android.content.res.Configuration
import android.os.Build
import android.os.StrictMode
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.recyclerview.widget.RecyclerView
import com.example.jetsnack.ui.components.JetsnackScaffold
import com.example.jetsnack.ui.theme.JetsnackTheme
import com.example.jetsnack.ui.utils.BlueLM
import kotlinx.coroutines.launch
import org.json.JSONObject

data class Message(val content: String, val isUser: Boolean)

class MessageAdapter(private val messages: List<Message>) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val textView = TextView(parent.context)
        return MessageViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.textView.text = message.content
        holder.textView.textAlignment = if (message.isUser) View.TEXT_ALIGNMENT_TEXT_END else View.TEXT_ALIGNMENT_TEXT_START
    }

    override fun getItemCount() = messages.size
}

fun getContentFromJson(jsonString: String): String {
    val jsonObject = JSONObject(jsonString)
    val dataObject = jsonObject.getJSONObject("data")
    return dataObject.getString("content")
}

@Composable
fun QuestionTextBox(qes:String) {
    Box(contentAlignment = Alignment.TopStart,
        modifier = Modifier.fillMaxWidth())
    {
        Box(

            modifier = Modifier
                .width(250.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Blue, Color.Blue)
                    ),
                    shape = RoundedCornerShape(
                        topStart = 15.dp, // 左上角圆角
                        bottomEnd = 15.dp // 右下角圆角
                    )
                )
                .padding(16.dp) // 根据需要调整内边距
        ) {
            Text(
                text = qes, // 在这里设置您的文本内容
                color = Color.White, // 字体颜色为白色
                style = TextStyle(fontWeight = FontWeight.Bold) // 根据需要设置字体样式
            )
        }
    }

}

@Composable
fun AnswarTextBox(ans:String) {
    Box(contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxWidth())
    {
        Box(

            modifier = Modifier
                .width(250.dp)

                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.Gray, Color.Gray)
                    ),
                    shape = RoundedCornerShape(
                        topEnd = 15.dp, // 左上角圆角
                        bottomStart = 15.dp // 右下角圆角
                    )
                )
                .padding(16.dp) // 根据需要调整内边距
        ) {
            Text(
                text = ans, // 在这里设置您的文本内容
                color = Color.White, // 字体颜色为白色
                style = TextStyle(fontWeight = FontWeight.Bold) // 根据需要设置字体样式
            )
        }
    }

}

@Composable
fun FixedSizeScrollableBox(boxes: SnapshotStateList<@Composable () -> Unit>) {
    // 创建一个ScrollState，用于记住滚动位置
    val scrollState = rememberScrollState()

    // 创建一个固定大小的Box，内部包含一个可滚动的Column
    Box(
        modifier = Modifier
            .height(600.dp)
            .fillMaxWidth()
            //.background(Color.LightGray) // 设置固定大小 // 设置背景颜色
    ) {
            Column(modifier = Modifier.verticalScroll(scrollState)

                .fillMaxWidth())

            {
                QuestionTextBox("您好！我是您的旅游小助手~有什么问题可以随时问我！")
                //AnswarTextBox()
                boxes.forEach { box ->
                    box()
                }


                // 在这里添加你的子组件
            }
        }
    }



@Composable
fun Profile(
    onNavigateToRoute: (String) -> Unit,
    modifier: Modifier = Modifier
) {

    val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
    StrictMode.setThreadPolicy(policy)
    val messages = mutableListOf<Message>()
    val adapter = MessageAdapter(messages)
    val userInput = remember { mutableStateOf(TextFieldValue()) }
    val context = LocalContext.current
    val boxes = remember { mutableStateListOf<@Composable () -> Unit>() }
    val coroutineScope = rememberCoroutineScope()
    // 创建一个可观察的状态，用于存储从网络请求返回的数据
    var result by remember { mutableStateOf("等待结果...") }

    JetsnackScaffold(
        bottomBar = {
            JetsnackBottomBar(
                tabs = HomeSections.values(),
                currentRoute = HomeSections.PROFILE.route,
                navigateToRoute = onNavigateToRoute
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .padding(24.dp)
                .padding(paddingValues)
        ) {


            FixedSizeScrollableBox(boxes)

            // 使用verticalScroll修饰符为Column组件添加垂直滑动能力

            Row()
            {
                // 假设userInput是一个可观察的状态
                val userInput = remember { mutableStateOf("") }

                // 使用Box来放置内容在屏幕底部
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Row(

                        horizontalArrangement = Arrangement.Center,
                        // 竖直方向下居中,
                                modifier = Modifier
                            .fillMaxWidth()
                            .height(IntrinsicSize.Min) // 使Row的高度适应内容

                    ) {

                        TextField(
                            value = userInput.value,
                            onValueChange = { userInput.value = it },
                            label = { Text("请输入你的消息", color = Color.White) },

                            modifier = Modifier
                                .weight(3f) // 分配比例权重
                                .height(100.dp) // 设置高度
                                .fillMaxHeight() // 填充高度
                                .background(Color.LightGray, RoundedCornerShape(15.dp)) // 设置灰色背景和圆角
                            ,
                            colors = TextFieldDefaults.textFieldColors(
                                backgroundColor = Color.Transparent, // 设置背景透明
                                cursorColor = Color.Black, // 设置光标颜色
                                disabledLabelColor = Color.Gray, // 设置禁用标签颜色
                                focusedIndicatorColor = Color.Transparent, // 设置焦点指示器透明
                                unfocusedIndicatorColor = Color.Transparent )// 设置非焦点指示器透明
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Box(
                            contentAlignment = Alignment.BottomCenter,
                            modifier = Modifier
                                .weight(1f) // 分配比例权重
                                .height(100.dp)

                        )
                        {
                            Button(
                                onClick = {



                                    if(userInput.value != "")
                                    {

                                        coroutineScope.launch {

                                            val nowAns = userInput.value
                                            boxes.add { AnswarTextBox(nowAns) }
                                            result = "..."

                                            // 假设fetchData是一个挂起函数，用于执行网络请求
                                           // Toast.makeText(context, userInput.value, Toast.LENGTH_SHORT).show()
                                            var a = BlueLM.vivogpt(userInput.value)
                                            a = getContentFromJson(a);
                                            //Toast.makeText(context, a, Toast.LENGTH_SHORT).show()
                                            // 更新状态，这将重新绘制UI
                                            result = a

                                            boxes.add { QuestionTextBox(a) }
                                        }
                                    }


                                },

                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
                                shape = RoundedCornerShape(25.dp),

                                modifier = Modifier
                                    .height(70.dp)
                                     // 分配比例权重

                                // 底部偏移
                            ) {
                                Text("发送")
                            }
                        }

                    }
                }
            }





        }
    }
}

fun addMessage(content: String, isUser: Boolean, messages: MutableList<Message>, adapter: MessageAdapter) {
    messages.add(Message(content, isUser))
    adapter.notifyItemInserted(messages.size - 1)
}

@Preview("default")
@Preview("dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview("large font", fontScale = 2f)
@Composable
fun ProfilePreview() {

    JetsnackTheme {
        Profile(onNavigateToRoute = { })
    }
}


