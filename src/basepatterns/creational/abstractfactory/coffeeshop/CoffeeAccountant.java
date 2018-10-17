package basepatterns.creational.abstractfactory.coffeeshop;

import basepatterns.creational.abstractfactory.Accountant;

public class CoffeeAccountant implements Accountant {
    @Override
    public void paySalary() {
        System.out.println("Accountant from coffee's shop pays salary");
    }
}
