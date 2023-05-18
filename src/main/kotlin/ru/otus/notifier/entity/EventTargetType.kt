package ru.otus.notifier.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.time.LocalDateTime
import java.util.*

@Entity
data class EventTargetType(
    @Id
    val id: UUID,
    @JoinColumn(name="event_target_id", nullable=false)
    val eventTarget: EventTarget,
    val description: UUID,
    val createAt: LocalDateTime
)
