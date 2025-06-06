package design_patterns.structural.adapter;

public class AmericanSocket implements Socket {
    @Override
    public String provideElectricity() {
        return "110v";
    }
}
