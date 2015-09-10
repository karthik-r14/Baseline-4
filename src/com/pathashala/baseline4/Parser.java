//A parser converts a string into a Commodity having a name and price
package com.pathashala.baseline4;

public class Parser {

    String parseString;

    public Parser(String parseString) {
        this.parseString = parseString;
    }

    public Commodity parse() {
        String[] parts = parseString.split(" ");
        return new Commodity(parts[1], Double.parseDouble(parts[parts.length-1]));
    }
}

