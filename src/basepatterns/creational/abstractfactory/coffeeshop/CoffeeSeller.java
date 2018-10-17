package basepatterns.creational.abstractfactory.coffeeshop;

import basepatterns.creational.abstractfactory.Seller;

public class CoffeeSeller implements Seller {
    @Override
    public void sellgoods() {
        System.out.println("A coffee's seller sells coffee");
    }
}
