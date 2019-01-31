package basepatterns.creational.builder;

public class ExpensiveHouseBuilder extends HouseBuilder {

    @Override
    void buildTypeOfWall() {
        house.setTypeOfWall("stone");
    }

    @Override
    void buildPrice() {
        house.setPrice(2000000);
        }

    @Override
    void buildNumberOfRooms() {
        house.setNumberOfRooms((byte)10);
        }

    @Override
    void buildNumberOfWindows() {
        house.setNumberOfWindows((byte)20);

    }

    @Override
    void buildNumberOfFloors() {
        house.setNumberOfFloors((byte)3);
    }

    @Override
    void buildGarden() {
        house.setGarden(true);

    }

    @Override
    void buildSwimmingPool() {
        house.setSwimmingPool(true);

    }
}
