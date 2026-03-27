package edu.eci.arsw.blueprints.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(new Info()
                .title("ARSW Parcial 2 API")
                .version("v1")
                .description("Blueprints Parcial tercio 2(Java 21 / Spring Boot 3.3.x)"));
            }
}
