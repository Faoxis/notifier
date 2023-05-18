package ru.otus.notifier.service

import org.springframework.stereotype.Service
import ru.otus.notifier.dto.user.NewSubscription

@Service
class PersonSubscriptionService(
    private val personService: PersonService
) {

    fun addNewSubscription(subscription: NewSubscription, login: String) {
        val person = personService.getPerson(login)
//        val subscription = Subscription()

    }

}