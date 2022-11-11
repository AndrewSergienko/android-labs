package com.sergienkoandrew.lab3

data class Chat (
    val id: Int,
    val avatar: Int,
    val name: String,
    val lastMessage: String,
    val lastMessageTime: String,
    val isRead: Boolean
)