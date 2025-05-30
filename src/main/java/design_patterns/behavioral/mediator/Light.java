package design_patterns.behavioral.mediator;

public class Light {

    private String state;
    private final TrafficMediator mediator;
    private final String name;

    public Light(String name, TrafficMediator mediator) {
        this.mediator = mediator;
        this.state = "yellow";
        this.name = name;
    }

    public void turnRed() {
        this.state = "red";
        System.out.println(this);

    }

    public void turnGreen() {
        this.state = "green";
        System.out.println(this);
        this.mediator.notify(this, "green");
    }

    @Override
    public String toString() {
        return "%s turned %s".formatted(this.name, this.state);
    }
}
