package basepatterns.creational.builder;

public class BuildHouseRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setHouseBuilder(new ExpensiveHouseBuilder());
        House house = director.buildHouse();

        System.out.println(house);
    }
}
//House {typeOfWall='stone', price=0, numberOfRooms=10, numberOfWindows=20, numberOfFloors=3, garden='true', swimmingPool='true'}