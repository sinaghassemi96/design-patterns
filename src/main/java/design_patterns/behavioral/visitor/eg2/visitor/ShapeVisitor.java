package design_patterns.behavioral.visitor.eg2.visitor;

import design_patterns.behavioral.visitor.eg2.objects.Circle;
import design_patterns.behavioral.visitor.eg2.objects.Rectangle;

public interface ShapeVisitor {

    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);

}
