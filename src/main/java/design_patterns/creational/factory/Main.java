package design_patterns.creational.factory;

import design_patterns.creational.factory.item_factory.CarFactory;
import design_patterns.creational.factory.item_factory.MotorcycleFactory;
import design_patterns.creational.factory.item_factory.TruckFactory;
import design_patterns.creational.factory.item_factory.VehicleFactory;

public class Main {

    public static VehicleFactory getFactory(String arg) {
        return switch (arg) {
            case "car" -> new CarFactory();
            case "motorcycle" -> new MotorcycleFactory();
            case "truck" -> new TruckFactory();
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + arg);
        };
    }

    public static void main(String[] args) {
        var carFactory = getFactory("car");
        var truckFactory = getFactory("truck");
        var motorcycleFactory = getFactory("motorcycle");

        var car = carFactory.create();
        var truck = truckFactory.create();
        var motorcycle = motorcycleFactory.create();

        System.out.println(car.driver() + ", " + car.type());
        System.out.println(truck.driver() + ", " + truck.type());
        System.out.println(motorcycle.driver() + ", " + motorcycle.type());

        // triggers an IllegalArgumentException
        var bicycleFactory = getFactory("bicycle");
        bicycleFactory.create();
    }
}
