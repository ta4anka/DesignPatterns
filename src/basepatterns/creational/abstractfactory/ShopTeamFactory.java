package basepatterns.creational.abstractfactory;

public interface ShopTeamFactory {
    Seller getSeller();

    Accountant getAccount();

    Owner getOwner();
}
