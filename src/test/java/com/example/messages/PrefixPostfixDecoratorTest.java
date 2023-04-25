package com.example.messages;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrefixPostfixDecoratorTest {

    @Test
    public void testDecorate() {
        PrefixPostfixDecorator decorator = new PrefixPostfixDecorator("[", "]");
        String actual = decorator.decorate("message");
        String expected = "[message]";
        assertEquals(expected, actual);
    }
}

