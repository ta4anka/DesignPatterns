package basepatterns.creational.prototype;

public class Warrior implements Copyable{
    private String typeOfWarrior;
    private String typeOfWeapon;
    private int strenth;

    public Warrior(String typeOfWarrior, String typeOfWeapon, int strenth) {
        this.typeOfWarrior = typeOfWarrior;
        this.typeOfWeapon = typeOfWeapon;
        this.strenth = strenth;
    }

    public String getTypeOfWarrior() {
        return typeOfWarrior;
    }

    public void setTypeOfWarrior(String typeOfWarrior) {
        this.typeOfWarrior = typeOfWarrior;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public int getStrenth() {
        return strenth;
    }

    public void setStrenth(int strenth) {
        this.strenth = strenth;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " typeOfWarrior='" + typeOfWarrior + '\'' +
                ", typeOfWeapon='" + typeOfWeapon + '\'' +
                ", strenth: " + strenth +
                '}';
    }

    @Override
    public Object copy() {
        Warrior copy = new Warrior(typeOfWarrior,typeOfWeapon,strenth);
        return copy;
    }
}
