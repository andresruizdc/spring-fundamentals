package com.andrdc.springfundamentals.entrypoints;

import com.andrdc.springfundamentals.json.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
    @GetMapping("/v1/hello")
    public Greet greet(@RequestParam(required = false, defaultValue = "World") String name) {
        return new Greet(String.format("Hello, %s!", name));
    }
}