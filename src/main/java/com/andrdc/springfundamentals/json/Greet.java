package com.andrdc.springfundamentals.json;

public class Greet {
    private String message;

    public Greet(){}

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Greet{" + "message='" + message + '\'' + "}";
    }
}