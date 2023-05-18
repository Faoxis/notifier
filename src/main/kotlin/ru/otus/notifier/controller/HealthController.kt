package ru.otus.notifier.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health/")
    fun getHeath(): Map<String, String> {
        return mapOf("status" to "OK")
    }

}