package design_patterns.behavioral.command.eg2;

import design_patterns.behavioral.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void sendOrderToKitchen() {
        if (!commands.isEmpty()) {
            for (Command command : commands) {
                command.execute();
            }
            commands.clear();
        }
    }

    public void cancelOrder(Command command) {
        command.undo();
        commands.remove(command);
    }

}
