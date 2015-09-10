package com.pathashala.baseline4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCommodity {

    @Test
    public void shouldBeExemptedFromSalesTaxIfCommodityIsBook() {
        Commodity commodity = new Commodity("book", 12.49);

        assertEquals(true, commodity.isExemptedFromSalesTax());
    }

    @Test
    public void shouldNotBeExemptedFromSalesTaxIfCommodityIsMusicCd() {
        Commodity commodity = new Commodity("music CD", 14.99);

        assertEquals(false, commodity.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfCommodityIsChocolateBar() {
        Commodity commodity = new Commodity("chocolate bar", 0.85);

        assertEquals(true, commodity.isExemptedFromSalesTax());
    }

    @Test
    public void shouldBeExemptedFromSalesTaxIfCommodityIsHeadachePills() {
        Commodity commodity = new Commodity("headache pills", 9.75);

        assertEquals(true, commodity.isExemptedFromSalesTax());
    }
}
