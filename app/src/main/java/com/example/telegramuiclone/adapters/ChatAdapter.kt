package com.example.telegramuiclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuiclone.R
import com.example.telegramuiclone.models.Chat

class ChatAdapter(private val context: Context, private val list: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_chat_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val chat = list[position]

        if (holder is MessageViewHolder) {
            (holder as MessageViewHolder).imageViewProfile.setImageResource(chat.profile)
            (holder as MessageViewHolder).textViewFullName.text = chat.fullName
            (holder as MessageViewHolder).textViewMessage.text = chat.message
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class MessageViewHolder(myItemView: View) : RecyclerView.ViewHolder(myItemView) {

        val imageViewProfile: ImageView = myItemView.findViewById(R.id.iv_profile)
        val textViewFullName: TextView = myItemView.findViewById(R.id.tv_full_name)
        val textViewMessage: TextView = myItemView.findViewById(R.id.tv_message)
    }
}
