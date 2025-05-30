package design_patterns.behavioral.visitor.eg2.visitor;

import design_patterns.behavioral.visitor.eg2.objects.Circle;
import design_patterns.behavioral.visitor.eg2.objects.Rectangle;
import lombok.Getter;

@Getter
public class MetricShapeVisitor implements ShapeVisitor {

    @Override
    public void visitCircle(Circle circle) {
        var r = circle.radius();
        System.out.printf("%s Area: %.6s cm^2\n",  circle, Math.PI * r * r);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        var height = rectangle.height();
        var width = rectangle.width();
        System.out.printf("%s Area: %.6s cm^2\n", rectangle, height * width);
    }
}
