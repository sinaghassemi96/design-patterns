package design_patterns.behavioral.template_method;

public class Main {

    public static void main(String[] args) {

        var feature1 = new ProductUdp("Pen", 2_250L);
        var feature2 = new User("Sina Ghassemi", 29, "Admin");

        feature1.execute();
        feature2.execute();

    }

}
