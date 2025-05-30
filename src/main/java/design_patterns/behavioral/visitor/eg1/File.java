package design_patterns.behavioral.visitor.eg1.objects;

import design_patterns.behavioral.visitor.eg1.visitors.FileVisitor;
import lombok.Getter;

@Getter
public class File {

    private final String name;
    private int size = 1024;

    public File(String name) {
        this.name = name;
    }

    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visitFile(this);
    }




}
