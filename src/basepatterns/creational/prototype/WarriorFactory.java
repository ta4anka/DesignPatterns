package basepatterns.creational.prototype;

public class WarriorFactory {
    Warrior warrior;

    public WarriorFactory(Warrior warrior) {
        this.warrior = warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    Warrior cloneWarrior(){
        return (Warrior) warrior.copy();
    }
}
