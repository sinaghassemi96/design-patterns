package design_patterns.structural.facade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This design pattern is used to hide sophisticated details from endpoint clients
 */
public class HomeFacade {

    private final ElectricalSystem electricalSystem =
            new ElectricalSystem();

    private final MechanicalSystem mechanicalSystem =
            new MechanicalSystem();

    public void turnOn() {
        System.out.println("Turning the system on");
        this.electricalSystem.setVoltage(220);
        this.mechanicalSystem.setPressure(2);
        this.mechanicalSystem.setTemperature(22);
    }

    public void turnOff() {
        System.out.println("Turning the system off");
        this.electricalSystem.setVoltage(0);
        this.mechanicalSystem.setPressure(0);
        this.mechanicalSystem.setTemperature(25);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    static class ElectricalSystem {
        private int voltage;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    static class MechanicalSystem {
        private int pressure;
        private int temperature;

    }

    public static void main(String[] args) {
        var homeFacade = new HomeFacade();
        homeFacade.turnOn();
        homeFacade.turnOff();
    }


}
