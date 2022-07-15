package com.industry.b121.b121.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Value("${info.version:}")
    private String version;
    @Value("${info.title:}")
    private String title;
    @Value("${info.description:}")
    private String description;

    @Bean
    public OpenAPI openAPI(ServletContext servletContext) {
        final var into = new Info()
                .version(version)
                .title(title)
                .description(description);
        final var server = new Server()
                .url(servletContext.getContextPath());
        return new OpenAPI()
                .servers(Collections.singletonList(server))
                .info(into);
    }
}
