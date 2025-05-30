package design_patterns.behavioral.strategy;

public class NoDiscount implements ShoppingDiscount {
    @Override
    public Long applyDiscount(Long value) {
        return value;
    }
}
