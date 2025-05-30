package design_patterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShoppingCart {

    private Long total;
    private ShoppingDiscount discountStrategy;
    private Long discounted;

    public ShoppingCart(Long total) {
        this.total = total;
        this.discountStrategy = new NoDiscount();
    }

    public Long getDiscountedPrice() {
        return this.discountStrategy.applyDiscount(total);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "total=" + total +
                ", discounted=" + getDiscountedPrice() +
                '}';
    }

    public static void main(String[] args) {
        var cart = new ShoppingCart(150000L);
        System.out.println(cart);
        cart.setDiscountStrategy(new BlackFridayDiscount());
        System.out.println(cart);
    }
}
