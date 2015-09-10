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

    @Test
    public void shouldBeExemptedFromSalesTaxIfCommodityIsBoxOfChocolates() {
        Commodity commodity = new Commodity("box of chocolates", 10.00);

        assertEquals(true, commodity.isExemptedFromSalesTax());
    }

    @Test
    public void shouldHaveNoSalesTaxIfCommodityIsExemptedFromSalesTax() {
        Commodity commodity = new Commodity("chocolate bar", 0.85);

        assertEquals(0.0, commodity.computeSalesTax(), 0.001);
    }

    @Test
    public void shouldHaveSalesTaxIfCommodityIsNotExemptedFromSalesTax() {
        Commodity commodity = new Commodity("bottle of perfume", 18.99);

        assertEquals(1.90, commodity.computeSalesTax(), 0.0001);
    }

    @Test
    public void shouldReturnTrueOnComparingWithACommodityOfSameNameAndPrice() {
        Commodity commodity1 = new Commodity("bottle of perfume", 18.99);
        Commodity commodity2 = new Commodity("bottle of perfume", 18.99);

        assertEquals(true, commodity1.compareWithCommodity(commodity2));
    }

    @Test
    public void shouldReturnFalseOnComparingWithACommodityOfDifferntNameAndPrice() {
        Commodity commodity1 = new Commodity("bottle of perfume", 18.99);
        Commodity commodity2 = new Commodity("book", 12.49);

        assertEquals(false, commodity1.compareWithCommodity(commodity2));
    }
}
