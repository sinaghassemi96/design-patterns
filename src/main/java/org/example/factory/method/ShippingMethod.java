package org.example.factory.method;

public interface ShippingMethod {

    Double calculateShippingCost(Double weight, Double distance);
    String getMethodName();

}
