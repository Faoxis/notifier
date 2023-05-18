package ru.otus.notifier.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.otus.notifier.entity.EventTarget
import java.util.UUID

interface EventTargetRepository : JpaRepository<EventTarget, UUID> {

}
