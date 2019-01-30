In **Factory pattern**, we create object `without exposing the creation logic to the client`
 and refer to newly created object using _a common interface_.
 In our example we create factory for creating teacher.
 * ***Step 1:*** create the interface Teacher with method `void teach();`
  * ***Step 2:*** create concrete classes implementing the same interface:
    * MathTeacher
    * ChemistryTeacher
  * ***Step 3:*** create the interface TeacherFactory with method `Teacher createTeacher();`
  * ***Step 4:*** create concrete classes implementing the same interface:
    * MathTeacherFactory, which  _returns new MathTeacher();_
    * ChemistryTeacherFactory, which  _returns new ChemistryTeacher;_
  * ***Step 5:*** in ClientAppRunner create the concrete factory:
    * `TeacherFactory teacherFactory = new` `SomeTeacherFactory();` // here Some = Math or Chemistry

    * `Teacher teacher = teacherFactory.createTeacher();`
    * `teacher.teach();`
    
  * ***Step 6:*** for improving this line of code: `TeacherFactory teacherFactory = new` `SomeTeacherFactory();`
    * create static method `static private TeacherFactory createTeacherFactoryBySpecialty(String specialty) ` 
    * and then change this line in the following way:`TeacherFactory teacherFactory1 = 
    createTeacherFactoryBySpecialty("some spesialty"*);`
        *  *here some spesialty = "chemistry" or "math" 
 
 
 