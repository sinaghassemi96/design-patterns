package design_patterns.structural.adapter;

public class AmericanDevice {

    private final Socket socket;

    public AmericanDevice(Socket socket) {
        this.socket = socket;
    }

    public void plugIn() {
        if (socket.provideElectricity().equals("220v")) {
            System.out.println("Device is working properly.");
        }
        else {
            System.out.println("Device is not working properly.");
        }
    }
}
