package basepatterns.creational.builder;

public class CheapHouseBuilder extends HouseBuilder {
    @Override
    void buildTypeOfWall() {
        house.setTypeOfWall("wood");
    }

    @Override
    void buildPrice() {
        house.setPrice(10000);

    }

    @Override
    void buildNumberOfRooms() {
        house.setNumberOfRooms((byte)2);

    }

    @Override
    void buildNumberOfWindows() {
        house.setNumberOfWindows((byte)2);

    }

    @Override
    void buildNumberOfFloors() {
        house.setNumberOfFloors((byte)1);

    }

    @Override
    void buildGarden() {
        house.setGarden(false);
    }

    @Override
    void buildSwimmingPool() {
        house.setSwimmingPool(false);

    }
}
