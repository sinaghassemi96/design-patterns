package design_patterns.behavioral.chain_of_responsibility;

import lombok.Data;

@Data
public class Request implements Cloneable {

    private Boolean isAuthorized;
    private String content;

    @Override
    protected Request clone() throws CloneNotSupportedException {
        return (Request) super.clone();
    }
}
