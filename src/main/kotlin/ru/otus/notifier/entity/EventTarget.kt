package ru.otus.notifier.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class EventTarget(
    @Id
    val id: UUID,
    @Column(name = "object")
    val objectType: String,
    val objectId: String,
    val createdAt: LocalDateTime
)
