package org.example.factory;

import lombok.Data;
import org.example.factory.factory.ShippingMethodFactory;
import org.example.factory.method.ShippingMethod;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {

    private List<Product> products = new ArrayList<>();
    private ShippingMethodFactory shippingMethodFactory;

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setShippingFactory(ShippingMethodFactory factory) {
        this.shippingMethodFactory = factory;
    }

    public Double calculateTotalShippingCost() throws Exception {
        if (null == shippingMethodFactory) {
            throw new Exception("Shipping factory not set!");
        }
        Double totalWeight = this.products.stream().mapToDouble(Product::getWeight).sum();
        Double totalDistance = this.products.stream().mapToDouble(Product::getDistance).sum();
        ShippingMethod method = shippingMethodFactory.createShippingMethod();
        return method.calculateShippingCost(totalWeight, totalDistance);
    }

}
