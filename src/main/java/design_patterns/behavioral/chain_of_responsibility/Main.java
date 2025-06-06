package design_patterns.behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        var req1 = new Request();
        req1.setIsAuthorized(true);
        req1.setContent("Hello");

        var req2 = req1.clone();
        req2.setIsAuthorized(false);

        var req3 = req1.clone();
        req3.setContent("Hello this one is a long comment");

        var finalHandler = new FinalHandler();
        var contentHandler = new ContentHandler(finalHandler);
        var authHandler = new AuthHandler(contentHandler);

        var resp1 = authHandler.handle(req1);
        var resp2 = authHandler.handle(req2);
        var resp3 = authHandler.handle(req3);

        System.out.println(resp1);
        System.out.println(resp2);
        System.out.println(resp3);
    }

}
