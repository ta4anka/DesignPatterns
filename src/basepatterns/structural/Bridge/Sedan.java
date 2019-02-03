package basepatterns.structural.Bridge;

public class Sedan extends Car {
    public Sedan(CarMaker carMaker) {
        super(carMaker);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        carMaker.setMaker();

    }
}
