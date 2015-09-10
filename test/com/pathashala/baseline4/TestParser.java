package com.pathashala.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestParser {

    @Test
    public void shouldReturnACommodityOnParsingTheInputString() {
        Parser parser = new Parser("1 music CD at 14.99");

        assertTrue(parser.parse() instanceof Commodity);
    }
}
