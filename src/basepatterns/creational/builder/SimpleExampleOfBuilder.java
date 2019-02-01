package basepatterns.creational.builder;

// a simple example of Builder pattern by using only one field
class House0{
    private String field;

    public void setField(String field) {    // setter
        this.field = field;
    }

    @Override
    public String toString() {return "House0 { " + field + " }";}

}
//----------------------------------------------
abstract class House0Builder{
        House0 house;

        void createHouse(){
            house = new House0();   // initialization house;
        }

        abstract void buildField();

        public House0 getHouse(){   // getter
            return house;
        }
    }
//----------------------------------------------

class ConcreteHouse0Builder extends House0Builder{
    @Override
    void buildField() {
        house.setField("TestField"); //realizaton abstract method
    }
}
//----------------------------------------------

class Director0 {
        House0Builder houseBuilder;
// setter
    public void setHouseBuilder(House0Builder houseBuilder) { //here we have a concrete builder
        this.houseBuilder = houseBuilder;
    }
    House0 buildeHouse(){
        houseBuilder.createHouse();

        houseBuilder.buildField();

        return houseBuilder.getHouse(); // house
    }
}
//===============================================

public class SimpleExampleOfBuilder {
    public static void main(String[] args) {
       Director0 director0 = new Director0();
       director0.setHouseBuilder(new ConcreteHouse0Builder());
       House0 house = director0.buildeHouse();
        System.out.println(house);  // House0 { TestField }
    }
}
