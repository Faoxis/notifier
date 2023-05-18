package ru.otus.notifier.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.util.UUID

@Entity
data class Subscription (
    @Id
    val userId: UUID,
    @JoinColumn(name="event_target_id", nullable=false)
    val eventTargetId: EventTarget
)