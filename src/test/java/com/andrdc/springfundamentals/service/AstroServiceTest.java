package com.andrdc.springfundamentals.service;

import com.andrdc.springfundamentals.json.Assignment;
import com.andrdc.springfundamentals.json.AstroResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AstroServiceTest {
    @Autowired
    private AstroService service;

    @Test
    public void autoWiringWorks() {
        assertNotNull(service);
    }

    @Test
    void getAstronauts() {
        AstroResult result = service.getAstronauts();
        final int number = result.getNumber();
        System.out.println(String.format("There are %s people in space", number));
        List<Assignment> people = result.getPeople();
        people.forEach(System.out::println);
        assertAll(
            () -> assertTrue(number >= 0),
            () -> assertEquals(number, people.size())
        );
    }
}
