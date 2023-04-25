package com.example;

import com.example.messages.Greeter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("Hello, world!");
        System.out.println(greeter.getGreeting());
    }
}
