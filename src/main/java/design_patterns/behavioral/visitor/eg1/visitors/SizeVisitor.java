package design_patterns.behavioral.visitor.eg1.visitors;

import design_patterns.behavioral.visitor.eg1.objects.Directory;
import design_patterns.behavioral.visitor.eg1.objects.File;

public class SizeVisitor implements FileVisitor{

    private int size;
    private int depth;

    @Override
    public void visitFile(File file) {
        size += file.getSize();
    }

    @Override
    public void visitDirectory(Directory directory) {
        System.out.println("Visiting directory for their size with depth: " + depth);
        depth++;
        for (var dir: directory.getDirectories()) {
            dir.accept(this);
        }
    }
}
