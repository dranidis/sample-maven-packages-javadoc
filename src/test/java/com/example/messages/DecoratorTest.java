package com.example.messages;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorate() {
        Decorator decorator = new Decorator("[", "]");
        String actual = decorator.decorate("message");
        String expected = "[message]";
        assertEquals(expected, actual);
    }
}

