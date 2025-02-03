package org.gunsugunaydin.AirlineManagement.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;

@Configuration
@OpenAPIDefinition(
  info = @Info(
    title = "AIRLINE MANAGEMENT API",
    version = "Version 1.0",
    description = "Airline Management API developed with Spring Boot.",
    contact = @Contact(
      name = "Günsu Günaydin", 
      email = "gunsugunay98@gmail.com", 
      url = "https://www.linkedin.com/in/gunsugunaydin/"
    ),
    license = @License(
      name = "Apache 2.0", 
      url = "https://www.apache.org/licenses/LICENSE-2.0"
    )
  )
)
public class SwaggerConfig {
  
}