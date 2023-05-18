package ru.otus.notifier.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class Event(
    @Id
    val id: UUID,
    val description: String,
    @ManyToOne
    @JoinColumn(name="event_target_id", nullable=false)
    val eventTarget: EventTarget,
    val createdAt: LocalDateTime
)
