package basepatterns.creational.abstractfactory.coffeeshop;

import basepatterns.creational.abstractfactory.Accountant;
import basepatterns.creational.abstractfactory.Owner;
import basepatterns.creational.abstractfactory.Seller;
import basepatterns.creational.abstractfactory.ShopTeamFactory;

public class CoffeeShopTeamFactory implements ShopTeamFactory {
    @Override
    public Seller getSeller() {
        return new CoffeeSeller();
    }

    @Override
    public Accountant getAccount() {
        return new CoffeeAccountant();
    }

    @Override
    public Owner getOwner() {
        return new CoffeShopOwner();
    }
}
