package org.example.factory.factory.impl;

import org.example.factory.factory.ShippingMethodFactory;
import org.example.factory.method.ShippingMethod;
import org.example.factory.method.impl.StandardShipping;

public class StandardShippingMethod implements ShippingMethodFactory {
    @Override
    public ShippingMethod createShippingMethod() {
        return new StandardShipping();
    }
}
