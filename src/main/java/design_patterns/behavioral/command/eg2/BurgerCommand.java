package design_patterns.behavioral.command.eg2;

import design_patterns.behavioral.command.Command;

public class BurgerCommand implements Command {

    private final Chef chef;

    public BurgerCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.fryingBurger();
    }

    @Override
    public void undo() {
        chef.throwingAway();
    }
}
