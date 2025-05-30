package design_patterns.behavioral.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {

    private State state;

    public Human(State state) {
        this.state = state;
    }

    private void think() {
        System.out.println(state.think());
    }

    public static void main(String[] args) {
        Human human = new Human(new HappyBehavior());
        human.think();
        human.setState(new AngryBehavior());
        human.think();
        human.setState(new SadBehavior());
        human.think();
    }



}
