package design_patterns.behavioral.visitor.eg2.objects;

public record Circle(double radius) {
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
