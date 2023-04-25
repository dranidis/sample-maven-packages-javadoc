package com.example;

import com.example.messages.Greeter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Greeter simpleGreeter = new Greeter("", "Hello, world!");
        System.out.println(simpleGreeter.getGreeting());

        Greeter decoratedGreeter = new Greeter("prepost", "Hello, world!");
        System.out.println(decoratedGreeter.getGreeting());
    }
}
