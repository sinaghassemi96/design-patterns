package design_patterns.structural.adapter;

public class EuropeanSocket implements Socket {
    @Override
    public String provideElectricity() {
        return "220v";
    }
}
