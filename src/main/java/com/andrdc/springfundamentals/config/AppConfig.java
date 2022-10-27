package com.andrdc.springfundamentals.config;

import com.andrdc.springfundamentals.json.Greet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Greet defaultGreet() {
        return new Greet("Hello, World!");
    }

    @Bean
    public Greet whatUpGreet() {
        return new Greet("What up?");
    }
}
