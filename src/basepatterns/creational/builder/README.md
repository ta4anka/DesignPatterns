The intent of **the Builder design pattern**
 is to separate the construction of a complex object from its representation.
In our example we create builder for creating houses.
 *  ***Step 1:*** create class House with some fields ans setters for this fileds;
  *  ***Step 2:*** create abxtract class HouseBulider for creating an instance of class House. 
  This class has:
        * field `House house`
        * `void method createHouse`, which initializes this one field:`house = new House();`
        * the abstract methods for for building all the fields from class House
in the future concrete realization of this class;
        * `getter getHouse();`   

 *  ***Step 3:*** create two concrete realizations: CheapHouseBuilder and ExpensiveHouseBuilder, which extends HouseBulider
and fill all the field of our house by using setters.

 *  ***Step 4:*** create class Director, which will be "tell" to Builder what to do.
 
*  ***Step 5:*** create class BuildHouseRunner, in which we can build any type of house.                 