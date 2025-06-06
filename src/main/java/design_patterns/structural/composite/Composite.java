package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private final String name;
    private final List<Component> components;

    public Composite(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    void addComponent(Component component) {
        components.add(component);
    }

    void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    void showDetails() {
        System.out.print(name);
        for (Component component : components) {
            if (component instanceof Composite) {
                System.out.print("\n\t|--");
            }
            component.showDetails();
        }

    }


}
