package com.pathashala.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCommodity {

    @Test
    public void shouldBeExemptedFromSalesTaxIfCommodityIsBook() {
        Commodity commodity = new Commodity("book", 12.49);

        assertEquals(true, commodity.isExemptedFromSalesTax());
    }
}
