package design_patterns.creational.factory.item;

public class Car extends Vehicle {
    @Override
    public String driver() {
        return "Driving a car";
    }

    @Override
    public String type() {
        return Car.class.getSimpleName();
    }
}
