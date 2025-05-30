package design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TrafficMediator {

    private final List<Light> trafficLights = new ArrayList<>();

    public void addTrafficLight(Light trafficLight) {
        trafficLights.add(trafficLight);
    }

    public void notify(Light light, String event) {
        if (event.equals("green"))
            trafficLights
                    .stream()
                    .filter(l -> !l.equals(light))
                    .forEach(Light::turnRed);
    }

    public static void main(String[] args) {
        var mediator = new TrafficMediator();

        var light1 = new Light("light1", mediator);
        var light2 = new Light("light2", mediator);
        var light3 = new Light("light3", mediator);
        var light4 = new Light("light4", mediator);

        mediator.addTrafficLight(light1);
        mediator.addTrafficLight(light2);
        mediator.addTrafficLight(light3);
        mediator.addTrafficLight(light4);

        light1.turnGreen();
        light2.turnGreen();
        light3.turnGreen();
        System.out.println(light4);
    }

}
