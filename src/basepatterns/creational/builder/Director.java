package basepatterns.creational.builder;

public class Director {
   HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    House buildHouse(){
        houseBuilder.createHouse();

        houseBuilder.buildTypeOfWall();
        houseBuilder.buildNumberOfRooms();
        houseBuilder.buildNumberOfFloors();
        houseBuilder.buildPrice();
        houseBuilder.buildNumberOfWindows();
        houseBuilder.buildSwimmingPool();
        houseBuilder.buildGarden();

        return houseBuilder.getHouse(); // house
    }
}
