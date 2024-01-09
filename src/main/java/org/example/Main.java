package org.example;

import org.example.factory.Product;
import org.example.factory.ShoppingCart;
import org.example.factory.factory.impl.ExpressShippingMethod;
import org.example.factory.factory.impl.StandardShippingMethod;
import org.example.singlton.Configuration;

public class Main {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 2.0, 100.0));
        cart.addProduct(new Product("Phone", 1.0, 50.0));

        cart.setShippingFactory(new StandardShippingMethod());
        System.out.println(cart.calculateTotalShippingCost());

        cart.setShippingFactory(new ExpressShippingMethod());
        System.out.println(cart.calculateTotalShippingCost());

        Configuration configuration = Configuration.getInstance("local_db_settings");
        Configuration anotherConfiguration = Configuration.getInstance("server_db_settings");
        configuration.setSettings("db_host", "localhost");
        System.out.println(configuration.value);
        System.out.println(anotherConfiguration.value);
        System.out.println(anotherConfiguration.getSettings().get("db_host"));
    }
}