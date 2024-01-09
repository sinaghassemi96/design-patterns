package org.example.factory.method.impl;

import org.example.factory.method.ShippingMethod;

public class StandardShipping implements ShippingMethod {
    @Override
    public Double calculateShippingCost(Double weight, Double distance) {
        return weight * .5 + distance * .3;
    }

    @Override
    public String getMethodName() {
        return "Standard";
    }
}
