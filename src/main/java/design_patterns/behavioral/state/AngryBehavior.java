package design_patterns.behavioral.state;

public class AngryBehavior implements State {
    @Override
    public String think() {
        return "I'm frustrated and angry. Everything is annoying me right now.";
    }
}
