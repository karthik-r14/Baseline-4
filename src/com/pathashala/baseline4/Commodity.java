//A commodity has a name, price and salesTax may be levied on it based on type of commodity.
package com.pathashala.baseline4;

import java.util.ArrayList;

public class Commodity {

    private String commodityName;
    private double commodityPrice;

    public Commodity(String name, double price) {
        commodityName = name;
        commodityPrice = price;
    }

    public boolean isExemptedFromSalesTax() {
        ArrayList<String> exemptCommodity = new ArrayList<>();
        exemptCommodity.add("book");
        exemptCommodity.add("chocolate bar");
        exemptCommodity.add("headache pills");
        exemptCommodity.add("box of chocolates");

        return exemptCommodity.contains(commodityName);
    }
}
