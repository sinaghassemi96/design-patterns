package design_patterns.structural.adapter;

public class SocketAdapter implements Socket {

    private final Socket socket;

    public SocketAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public String provideElectricity() {
        if (socket.provideElectricity().equals("110v")) {
            return "220v";
        }
        return socket.provideElectricity();
    }
}
