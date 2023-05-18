package ru.otus.notifier.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Server URL")})
public class SpringdocConfiguration {

    /*
   WEB:  http://localhost:8000/swagger-ui/index.html
   JSON: http://localhost:8000/v3/api-docs/notifier
    */
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
            .group("notifier")
            .pathsToMatch("/**")
            .build();
    }
}
