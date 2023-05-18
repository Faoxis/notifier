package ru.otus.notifier.service

import org.springframework.stereotype.Service
import ru.otus.notifier.entity.Person
import ru.otus.notifier.repository.PersonRepository
import java.time.LocalDateTime
import java.util.*

@Service
class PersonService(
    private val repository: PersonRepository
) {

    fun getPerson(login: String): Person {
        return repository.findByLogin(login) ?:
            createNewPerson(login)
    }

    private fun createNewPerson(login: String): Person {
        val newPerson = Person(
            id = UUID.randomUUID(),
            login = login,
            LocalDateTime.now()
        )
        return repository.save(newPerson)
    }
}
