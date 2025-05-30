package design_patterns.behavioral.visitor.eg2;

import design_patterns.behavioral.visitor.eg2.objects.Circle;
import design_patterns.behavioral.visitor.eg2.objects.Rectangle;
import design_patterns.behavioral.visitor.eg2.visitor.ImperialShapeVisitor;
import design_patterns.behavioral.visitor.eg2.visitor.MetricShapeVisitor;

public class Main {

    public static void main(String[] args) {
        var ShapeVisitorMetric = new MetricShapeVisitor();
        var shapeVisitorImperial = new ImperialShapeVisitor();

        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 5);

        shapeVisitorImperial.visitCircle(circle);
        ShapeVisitorMetric.visitCircle(circle);

        shapeVisitorImperial.visitRectangle(rectangle);
        ShapeVisitorMetric.visitRectangle(rectangle);

    }

}
