package design_patterns.behavioral.chain_of_responsibility;

public class FinalHandler extends Handler {

    public FinalHandler() {
        super(null);
    }

    @Override
    public String handle(Request request) {
        System.out.println("Finalizing comment posting");
        return "comment was posted successfully";
    }
}
