package design_patterns.behavioral.command.eg1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class acts like the sender of the commands
 */
public class TextEditor {

    private final List<String> history = new ArrayList<>();

    public void write(String text) {
        history.add(text);
        this.print();
    }

    public void undoWrite() {
        if (!history.isEmpty()) {
            System.out.println("undoing");
            history.remove(history.size() - 1);
            this.print();
        } else {
            System.out.println("nothing");
        }
    }

    public void print() {
        System.out.println(history.stream().reduce("", (a, b) -> a + " " + b));
    }

}
