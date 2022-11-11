package com.sergienkoandrew.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val items: List<Chat>):
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ChatViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val chatAvatar = itemView.findViewById<ImageView>(R.id.chat_avatar)
        private val chatName = itemView.findViewById<TextView>(R.id.chat_name)
        private val chatLastMessage = itemView.findViewById<TextView>(R.id.chat_lastMessage)
        private val chatLastMessageTime = itemView.findViewById<TextView>(R.id.chat_lastMessageTime)
        private val chatReadStatus = itemView.findViewById<ImageView>(R.id.chat_readStatus)

        fun bind(chat: Chat){
            chatName.text = chat.name
            chatLastMessage.text = chat.lastMessage
            chatLastMessageTime.text = chat.lastMessageTime
            chatAvatar.setImageResource(chat.avatar)

            val isReadIcon = if (chat.isRead){
                R.drawable.read_icon
            } else {
                R.drawable.unread_icon
            }
            chatReadStatus.setImageResource(isReadIcon)
        }
    }
}