package design_patterns.structural.composite;

/**
 * Acts as the leaves in this pattern
 */
public class Leaf extends Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void showDetails() {
        System.out.print("\n\t|\t|--" + name);
    }
}
