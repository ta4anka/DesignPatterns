package basepatterns.creational.builder;

public class House {
    private String typeOfWall; //required
    private int price; //required
    private byte numberOfRooms; //required
    private byte numberOfWindows; //required
    private byte numberOfFloors;  //required
    private boolean garden; //optional
    private boolean swimmingPool; //optional

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfRooms(byte numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfWindows(byte numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return "House {" +
                "typeOfWall='" + typeOfWall + '\'' +
                ", price=" + price +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfFloors=" + numberOfFloors +
                ", garden='" + garden + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                '}';
    }
}
