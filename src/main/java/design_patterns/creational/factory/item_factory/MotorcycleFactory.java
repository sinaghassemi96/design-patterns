package design_patterns.creational.factory.item_factory;

import design_patterns.creational.factory.item.Motorcycle;
import design_patterns.creational.factory.item.Vehicle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Motorcycle();
    }
}
