package ru.otus.notifier.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import ru.otus.notifier.dto.user.NewSubscription
import ru.otus.notifier.service.PersonSubscriptionService

@RestController
class SubscriptionController(
    val personSubscriptionService: PersonSubscriptionService
) {



    @PostMapping
    fun addSubscription(@RequestBody subscription: NewSubscription, @RequestHeader login: String) {
        personSubscriptionService.addNewSubscription(subscription, login)
    }

    @DeleteMapping
    fun deleteSubscription() {

    }

    @GetMapping
    fun getSubscription() {

    }
}
