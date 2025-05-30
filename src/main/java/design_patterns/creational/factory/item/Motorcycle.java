package design_patterns.creational.factory.item;

public class Motorcycle extends Vehicle {
    @Override
    public String driver() {
        return "Riding a motorcycle.";
    }

    @Override
    public String type() {
        return Motorcycle.class.getSimpleName();
    }
}
