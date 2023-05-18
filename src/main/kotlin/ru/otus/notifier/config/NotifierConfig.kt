package ru.otus.notifier.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "notifier")
data class NotifierConfig (
    val allowedObjectTypes: List<String>
)