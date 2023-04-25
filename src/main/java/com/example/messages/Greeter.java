package com.example.messages;

public class Greeter {
    private String message;
    private Decorator decorator;

    public Greeter(Decorator decorator, String message) {
        this.decorator = decorator;
        this.message = message;
    }

    /**
     * Returns the message received at the constructor decorated by the decorator received at the constructor.
     * 
     * @return the decorated greeting
     */
    public String getGreeting() {
        return decorator.decorate(message);
    }
}
