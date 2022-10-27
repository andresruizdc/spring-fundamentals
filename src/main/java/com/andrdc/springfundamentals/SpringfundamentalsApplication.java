package com.andrdc.springfundamentals;

import com.andrdc.springfundamentals.json.Greet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringfundamentalsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringfundamentalsApplication.class, args);
	}
}