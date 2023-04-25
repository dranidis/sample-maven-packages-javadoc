package com.example.messages;

public class Greeter {
    private String message;
    private Decorator decorator;

    public Greeter(String decoratorId, String message) {
        if (decoratorId.equals("prepost")) {
            decorator = new PrefixPostfixDecorator("<~~ ", " ~~>");
        }
        this.message = message;
    }

    /**
     * Returns the message received at the constructor decorated by the decorator defined at the constructor.
     * 
     * @return the decorated greeting
     */
    public String getGreeting() {
        String greeting;
        if (decorator != null) {
            greeting = decorator.decorate(message);
        } else {
            greeting = message;
        }
        return greeting;
    }
}
