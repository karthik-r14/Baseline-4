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
        ArrayList<String> exemptedCommodities = new ArrayList<>();
        exemptedCommodities.add("book");
        exemptedCommodities.add("chocolate bar");
        exemptedCommodities.add("headache pills");
        exemptedCommodities.add("box of chocolates");

        return exemptedCommodities.contains(commodityName);
    }

    public double computeSalesTax() {

        if(isExemptedFromSalesTax())
            return 0.0;
        else
            return Math.ceil((0.10 * commodityPrice) * 20.0) / 20.0;
    }
}
