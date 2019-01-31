package basepatterns.creational.builder;

public  abstract class HouseBuilder {
    House house;

    void createHouse() {
        house = new House();
    }
    abstract void buildTypeOfWall();
    abstract void buildPrice();
    abstract void buildNumberOfRooms();
    abstract void buildNumberOfWindows();
    abstract void buildNumberOfFloors();
    abstract void buildGarden();
    abstract void buildSwimmingPool();

    public House getHouse() {
        return house;
    }
}

