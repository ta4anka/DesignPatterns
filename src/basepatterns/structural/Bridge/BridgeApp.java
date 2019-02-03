package basepatterns.structural.Bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car car = new Sedan(new Skoda());
        car.showDetails();
    }
}
