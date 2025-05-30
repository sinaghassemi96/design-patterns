package design_patterns.behavioral.state;

public class SadBehavior implements State {
    @Override
    public String think() {
        return "I'm feeling down. Everything seems gloomy and hard.";
    }
}
