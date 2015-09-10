//A commodity has a name, price and salesTax may be levied on it based on type of commodity.
package com.pathashala.baseline4;

public class Commodity {

    private String commodityName;
    private double commodityPrice;

    public Commodity(String name, double price) {
        commodityName = name;
        commodityPrice = price;
    }

    public boolean isExemptedFromSalesTax() {
        return true;
    }
}
