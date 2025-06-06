package design_patterns.behavioral.chain_of_responsibility;

public class Handler {

    Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String handle(Request request) {
        if (this.nextHandler != null) {
            return this.nextHandler.handle(request);
        }
        return "No next handler.";
    }
}
