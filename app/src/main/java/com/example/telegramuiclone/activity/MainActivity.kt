package com.example.telegramuiclone.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuiclone.R
import com.example.telegramuiclone.adapters.ChatAdapter
import com.example.telegramuiclone.models.Chat

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        context = this

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 1)

        refreshAdapter(recyclerView, prepareChatList())
    }

    private fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>) {
        val chatAdapter = ChatAdapter(context, chats)
        recyclerView.adapter = chatAdapter
    }

    private fun prepareChatList(): ArrayList<Chat> {
        val list = ArrayList<Chat>()

        for (i in 1..10) {
            list.add(
                Chat(
                    R.drawable.image_profile_1,
                    "Xurshidbek Kurbanov",
                    "Hello guys, how are you?"
                )
            )
            list.add(
                Chat(
                    R.drawable.image_profile_1,
                    "Begzodbek Kurbanov",
                    "Hello brother, I am fine thank you. And you?"
                )
            )
            list.add(
                Chat(
                    R.drawable.image_profile_1,
                    "Sherzodbek Kurbanov",
                    "I am great! Thank you for asking..."
                )
            )
        }
        return list
    }
}


