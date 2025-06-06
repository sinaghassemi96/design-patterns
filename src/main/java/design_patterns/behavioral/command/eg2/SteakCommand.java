package design_patterns.behavioral.command.eg2;

import design_patterns.behavioral.command.Command;

public class SteakCommand implements Command {

    private final Chef chef;

    public SteakCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookingSteak();
    }

    @Override
    public void undo() {
        chef.throwingAway();
    }
}
