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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jetsnack.R
import com.example.jetsnack.ui.components.JetsnackScaffold
import com.example.jetsnack.ui.theme.JetsnackTheme
import com.example.jetsnack.ui.utils.BlueLM
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
                .fillMaxSize()
                .wrapContentSize()
                .padding(24.dp)
                .padding(paddingValues)
        ) {
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
                                    var a = BlueLM.vivogpt()
                                    a = getContentFromJson(a);
                                },
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
                                shape = RoundedCornerShape(25.dp),

                                modifier = Modifier
                                    .height(70.dp)
                                     // 分配比例权重

                                // 底部偏移
                            ) {
                                Text("点击我")
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


