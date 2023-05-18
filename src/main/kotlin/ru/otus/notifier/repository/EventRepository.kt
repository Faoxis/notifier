package ru.otus.notifier.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.otus.notifier.entity.Event
import java.util.UUID

interface EventRepository : JpaRepository<Event, UUID> {

}
