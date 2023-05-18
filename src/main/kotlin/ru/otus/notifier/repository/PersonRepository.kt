package ru.otus.notifier.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.otus.notifier.entity.Person
import java.util.*

interface PersonRepository : JpaRepository<Person, UUID> {
    fun findByLogin(login: String): Person?
}
