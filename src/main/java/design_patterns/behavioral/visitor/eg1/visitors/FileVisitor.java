package design_patterns.behavioral.visitor.eg1.visitors;

import design_patterns.behavioral.visitor.eg1.objects.Directory;
import design_patterns.behavioral.visitor.eg1.objects.File;

public interface FileVisitor {

    void visitFile(File file);

    void visitDirectory(Directory directory);

}
