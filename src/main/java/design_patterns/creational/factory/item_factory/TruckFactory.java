package design_patterns.creational.factory.item_factory;

import design_patterns.creational.factory.item.Truck;
import design_patterns.creational.factory.item.Vehicle;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Truck();
    }
}
