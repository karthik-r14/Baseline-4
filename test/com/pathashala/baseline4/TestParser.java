package com.pathashala.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestParser {

    @Test
    public void shouldReturnACommodityOnParsingASampleInputString1() {
        Parser parser = new Parser("1 music CD at 14.99");

        assertTrue(parser.parse() instanceof Commodity);
    }

    @Test
    public void shouldReturnACommodityOnParsingASampleInputString2() {
        Parser parser = new Parser("1 book at 12.49");

        Commodity commodity1 = new Commodity("book", 12.49);
        Commodity commodity2 = parser.parse();
        assertEquals(true, commodity2.compareWithCommodity(commodity1));
    }
}
