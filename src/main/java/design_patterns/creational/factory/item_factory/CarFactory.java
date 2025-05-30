package design_patterns.creational.factory.item_factory;

import design_patterns.creational.factory.item.Car;
import design_patterns.creational.factory.item.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Car();
    }
}
