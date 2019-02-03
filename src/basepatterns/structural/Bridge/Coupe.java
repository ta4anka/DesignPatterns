package basepatterns.structural.Bridge;

public class Coupe extends Car {
    public Coupe(CarMaker carMaker) {
        super(carMaker);
    }

    @Override
    void showDetails() {
        System.out.println("Coupe");
        carMaker.setMaker();

    }
}
