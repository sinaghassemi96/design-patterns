package design_patterns.behavioral.strategy;

public class BlackFridayDiscount implements ShoppingDiscount {
    @Override
    public Long applyDiscount(Long value) {
        return (long) (value * 0.8);
    }
}
