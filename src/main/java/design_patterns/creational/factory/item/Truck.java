package design_patterns.creational.factory.item;

public class Truck extends Vehicle {
    @Override
    public String driver() {
        return "Driving a truck";
    }

    @Override
    public String type() {
        return Truck.class.getSimpleName();
    }
}
