package design_patterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        var root = new Composite("root");
        var documents = new Composite("documents");
        var pictures = new Composite("pictures");

        var file1 = new Leaf("file1.txt");
        var file2 = new Leaf("file2.txt");
        var file3 = new Leaf("my awesome picture.jpg");

        documents.addComponent(file1);
        documents.addComponent(file2);
        pictures.addComponent(file3);

        root.addComponent(documents);
        root.addComponent(pictures);

        root.showDetails();
    }
}
