package org.example.factory.method.impl;

import org.example.factory.method.ShippingMethod;

public class ExpressShipping implements ShippingMethod {
    @Override
    public Double calculateShippingCost(Double weight, Double distance) {
        return weight * 0.7 + distance * 0.5;
    }

    @Override
    public String getMethodName() {
        return "Express";
    }
}
