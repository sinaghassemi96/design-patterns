package design_patterns.behavioral.visitor.eg1.objects;

import design_patterns.behavioral.visitor.eg1.visitors.FileVisitor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Directory {

    private final String name;
    private final List<Directory> directories;

    public Directory(String name) {
        this.name = name;
        this.directories = new ArrayList<>();
    }

    public void addDirectory(Directory directory) {
        this.directories.add(directory);
    }

    public void accept(FileVisitor visitor) {
        visitor.visitDirectory(this);
    }
}
