package design_patterns.behavioral.template_method;

public abstract class Feature {

    public void execute() {
        // سایر عملیات اینجا تعریف می‌شود
        this.exportToXml();
    }

    abstract void exportToXml();

}
