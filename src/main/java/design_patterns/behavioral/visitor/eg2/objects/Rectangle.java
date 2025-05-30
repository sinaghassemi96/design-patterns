package design_patterns.behavioral.visitor.eg2.objects;

public record Rectangle(double width, double height) {
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
