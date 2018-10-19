**Prototype** pattern refers to creating `duplicate object`

This pattern involves implementing a `prototype interface`
which tells to create a clone of the current object.

_In our example_ as prototype interface we use "Copyable" and class Warrior implements this interface.
Then we create WarriorFactory with method cloneWarrior()  for cloning Warrior's objects.