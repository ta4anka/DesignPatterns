package basepatterns.structural.Bridge;

public abstract class Car {
    CarMaker carMaker;

    public Car(CarMaker carMaker) {
        this.carMaker = carMaker;
    }

    abstract void showDetails();
}
