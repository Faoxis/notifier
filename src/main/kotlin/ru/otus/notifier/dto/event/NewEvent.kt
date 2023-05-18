package ru.otus.notifier.dto.event

import java.time.LocalDateTime

data class NewEvent (
    val type: String,
    val eventObjectId: String,
    val description: String,
    val createdAt: LocalDateTime
)
