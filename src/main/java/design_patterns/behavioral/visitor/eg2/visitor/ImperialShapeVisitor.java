package design_patterns.behavioral.visitor.eg2.visitor;

import design_patterns.behavioral.visitor.eg2.objects.Circle;
import design_patterns.behavioral.visitor.eg2.objects.Rectangle;

public class ImperialShapeVisitor implements ShapeVisitor {

    private final Double conversionFactor = 0.0328084;

    @Override
    public void visitCircle(Circle circle) {
        var r = circle.radius() * conversionFactor;
        System.out.printf("%s Area: %.6s ft^2\n",  circle, Math.PI * r * r);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        var height = rectangle.height()  * conversionFactor;
        var width = rectangle.width()  * conversionFactor;
        System.out.printf("%s Area: %.6s ft^2\n", rectangle, height * width);
    }
}
