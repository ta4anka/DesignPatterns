**Bridge** is used when we need to decouple an abstraction from its implementation so that the two can vary independently.

In our example **abstract class Car** defines type of car(Sedan or Coupe), **interface CarMaker** defines maker(Kia or Skoda).
**BridgeApp** will be use abstract class Car, because this class keep link to interface CarMaker. 