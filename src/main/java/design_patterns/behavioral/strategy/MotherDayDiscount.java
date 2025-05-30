package design_patterns.behavioral.strategy;

public class MotherDayDiscount implements ShoppingDiscount {
    @Override
    public Long applyDiscount(Long value) {
        return (long) (0.5 * value);
    }
}
