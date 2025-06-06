package design_patterns.behavioral.command;

/**
 * Consider this like ordering food. Commands are different orders
 */
public interface Command {

    void execute();

    void undo();

}
