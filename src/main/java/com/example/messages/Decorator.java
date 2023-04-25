package com.example.messages;

public class Decorator {

    private String prefix;
    private String postfix;

    /**
     * Creates a Decorator that adds the prefix string at the beginning and a postfix string at the end of a string.
     * 
     * @param prefix
     * @param postfix
     */
    public Decorator(String prefix,  String postfix) {
        this.prefix = prefix;
        this.postfix = postfix;
    }

    String decorate (String message) {
        return prefix + message + postfix;
    }

}
