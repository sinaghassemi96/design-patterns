package design_patterns.behavioral.visitor.eg1.visitors;

import design_patterns.behavioral.visitor.eg1.objects.Directory;
import design_patterns.behavioral.visitor.eg1.objects.File;

public class PrintVisitor implements FileVisitor {
    @Override
    public void visitFile(File file) {
        System.out.println(file.getName());
    }

    @Override
    public void visitDirectory(Directory directory) {

    }
}
