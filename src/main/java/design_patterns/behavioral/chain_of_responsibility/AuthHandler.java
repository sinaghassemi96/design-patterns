package design_patterns.behavioral.chain_of_responsibility;

public class AuthHandler extends Handler {

    public AuthHandler() {
        super(null);
    }

    public AuthHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public String handle(Request request) {
        if (request.getIsAuthorized()) {
            System.out.println("Request was authorized");
            return super.handle(request);
        }
        return "Request was not authorized";

    }

}
