package com.example.messages;

class PrefixPostfixDecorator implements Decorator {

    private String prefix;
    private String postfix;

    /**
     * Creates a Decorator that adds the prefix string at the beginning and a postfix string at the end of a string.
     * 
     * @param prefix the string to add at the beginning
     * @param postfix the string to add at the end
     */
    PrefixPostfixDecorator(String prefix,  String postfix) {
        this.prefix = prefix;
        this.postfix = postfix;
    }

    public String decorate (String message) {
        return prefix + message + postfix;
    }

}
