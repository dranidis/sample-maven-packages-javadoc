package com.example;

import com.example.messages.Decorator;
import com.example.messages.Greeter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Decorator decorator = new Decorator("<~~ ", " ~~>");
        Greeter greeter = new Greeter(decorator, "Hello, world!");
        System.out.println(greeter.getGreeting());
    }
}
