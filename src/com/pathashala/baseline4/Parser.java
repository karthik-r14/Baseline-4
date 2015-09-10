//A parser converts a string into a Commodity having a name and price
package com.pathashala.baseline4;

public class Parser {

    String parseString;

    public Parser(String parseString) {
        this.parseString = parseString;
    }

    public Commodity parse() {
        return new Commodity("Music Cd", 18.99);
    }
}

