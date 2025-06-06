package design_patterns.behavioral.command.eg1;

import design_patterns.behavioral.command.Command;

import java.util.ArrayList;
import java.util.List;

public class EditorInvoker {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void execute() {
        if (commands.isEmpty()) {
            System.out.println("Nothing to do");
        }
        else {
            for (Command command : commands) {
                command.execute();
                commands.remove(command);
            }
        }
    }

    public void cancel(Command command) {
        System.out.println("Cancelled command: " + command);
        commands.remove(command);
    }

}
