package ru.otus.notifier.dto.user

import java.time.LocalDateTime

data class UserEvent (
    val type: String,
    val eventObjectId: String,
    val description: String,
    val label: String,
    val createdAt: LocalDateTime
)
