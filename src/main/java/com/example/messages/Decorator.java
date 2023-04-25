package com.example.messages;

class Decorator {

    private String prefix;
    private String postfix;

    Decorator(String prefix,  String postfix) {
        this.prefix = prefix;
        this.postfix = postfix;
    }

    String decorate (String message) {
        return prefix + message + postfix;
    }

}
