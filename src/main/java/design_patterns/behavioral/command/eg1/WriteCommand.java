package design_patterns.behavioral.command.eg1;

import design_patterns.behavioral.command.Command;

/**
 * Now consider this one as a sample of available commands. This one is a writer command. It acts as the receiver
 */
public class WriteCommand implements Command {

    private final TextEditor editor;
    private final String text;

    public WriteCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        this.editor.write(this.text);
    }

    @Override
    public void undo() {
        this.editor.undoWrite();
    }
}
