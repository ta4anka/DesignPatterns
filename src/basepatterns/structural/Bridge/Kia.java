package basepatterns.structural.Bridge;

public class Kia implements CarMaker {
    @Override
    public void setMaker() {
        System.out.println("Kia");
    }
}
