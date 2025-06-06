package design_patterns.behavioral.chain_of_responsibility;

public class ContentHandler extends Handler {

    public ContentHandler() {
        super(null);
    }

    public ContentHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handle(Request request) {
        if (request.getContent() != null && request.getContent().length() > 10) {
            System.out.println("content is valid");
            return super.handle(request);
        }
        return "Content is too short";
    }
}
