package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.coffeeshop.CoffeeShopTeamFactory;

public class CoffeShopMain {
    public static void main(String[] args) {
        ShopTeamFactory shopTeamFactory = new CoffeeShopTeamFactory();
        Seller seller = shopTeamFactory.getSeller();
        Accountant accountant = shopTeamFactory.getAccount();
        Owner owner = shopTeamFactory.getOwner();

        System.out.println("Creating coffee shop: ");

        seller.sellgoods();
        accountant.paySalary();
        owner.runShop();
    }
}
