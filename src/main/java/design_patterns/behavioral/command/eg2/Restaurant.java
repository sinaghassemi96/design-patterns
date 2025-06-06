package design_patterns.behavioral.command.eg2;

public class Restaurant {

    public static void main(String[] args) {
        var chef = new Chef();

        var burger = new BurgerCommand(chef);
        var steak = new SteakCommand(chef);

        var waiter = new Waiter();
        waiter.addCommand(burger);
        waiter.addCommand(steak);

        waiter.sendOrderToKitchen();
    }

}
