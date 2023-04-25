package com.example.messages;

public class Greeter {
    private String message;

    public Greeter(String message) {
        this.message = message;
    }

    public String getGreeting() {
        Decorator decorator = new Decorator("<~~ ", " ~~>");
        return decorator.decorate(message);
    }
}
