package basepatterns.structural.Bridge;

public class Skoda implements CarMaker {
    @Override
    public void setMaker() {
        System.out.println("Skoda");
    }
}
