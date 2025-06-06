package design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {

        var americanSocket = new AmericanSocket();
        var europeanSocket = new EuropeanSocket();
        var socketAdapter = new SocketAdapter(europeanSocket);

        var dev1 = new AmericanDevice(americanSocket);
        var dev2 = new AmericanDevice(europeanSocket);
        var adapted = new AmericanDevice(socketAdapter);

        dev1.plugIn();
        dev2.plugIn();
        adapted.plugIn();
    }
}
