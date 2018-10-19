package basepatterns.creational.prototype;

public class ClientClassRunner {
    public static void main(String[] args) {
        Warrior sample = new Warrior("Spearman","Spear",100);
        System.out.println(sample);

        WarriorFactory factory = new WarriorFactory(sample);
        Warrior sampleClone = factory.cloneWarrior();
        System.out.println("---------------------------------------------------------------------");
        System.out.println(sampleClone);

    }
}

/*
Warrior{ typeOfWarrior='Spearman', typeOfWeapon='Spear', strenth: 100}
---------------------------------------------------------------------
Warrior{ typeOfWarrior='Spearman', typeOfWeapon='Spear', strenth: 100}
*/
