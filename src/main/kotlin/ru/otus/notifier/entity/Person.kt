package ru.otus.notifier.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.*

@Entity
data class Person (
    @Id
    val id: UUID,
    val login: String,
    val createdAt: LocalDateTime
)
