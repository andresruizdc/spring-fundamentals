package com.andrdc.springfundamentals.entrypoints;

import com.andrdc.springfundamentals.json.Greet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestTest {
    @Autowired
    private TestRestTemplate template;

    @Test
    public void greetWithName() {
        Greet response = template.getForObject("/v1/hello?name=Gizmo", Greet.class);
        assertEquals("Hello, Gizmo!", response.getMessage());
    }

    @Test
    public void greetWithoutName() {
        ResponseEntity<Greet> entity = template.getForEntity("/v1/hello", Greet.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, entity.getHeaders().getContentType());
        Greet response = entity.getBody();
        if (response != null) {
            assertEquals("Hello, World!", response.getMessage());
        }
    }
}
