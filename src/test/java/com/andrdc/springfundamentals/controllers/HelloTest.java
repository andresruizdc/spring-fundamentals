package com.andrdc.springfundamentals.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareConcurrentModel;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void sayHello() {
        Hello controller = new Hello();
        Model model = new BindingAwareConcurrentModel();
        String result = controller.sayHello("World", model);
        assertAll(
                () -> assertEquals("World", model.getAttribute("user")),
                () -> assertEquals("hello", result)
        );
    }
}
