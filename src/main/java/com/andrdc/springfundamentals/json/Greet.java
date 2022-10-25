package com.andrdc.springfundamentals.json;

public class Greet {
    private final String message;

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "Greet {" + "message='" + this.message + '\'' + "}";
    }
}
