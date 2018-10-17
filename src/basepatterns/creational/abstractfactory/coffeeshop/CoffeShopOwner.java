package basepatterns.creational.abstractfactory.coffeeshop;

import basepatterns.creational.abstractfactory.Owner;

public class CoffeShopOwner implements Owner {
    @Override
    public void runShop() {
        System.out.println("CoffeShop's Owner runs coffee shop...");

    }
}
