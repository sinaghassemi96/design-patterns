package design_patterns.behavioral.state;

public class HappyBehavior implements State {
    @Override
    public String think() {
        return "Everything is great! I'm feeling positive and optimistic.";
    }
}
