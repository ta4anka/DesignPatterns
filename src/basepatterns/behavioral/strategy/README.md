**In Strategy pattern**, we create objects which represent various strategies and a context object
 whose behavior varies as per its strategy object. The strategy object changes the executing
algorithm of the context object.

![pic](https://upload.wikimedia.org/wikipedia/commons/3/39/Strategy_Pattern_in_UML.png)

the difference between state and strategy:
* **state** --> change of activity is determined **in advance** `in business logic`;
* **strategy** --> change of activity `in the client code`.