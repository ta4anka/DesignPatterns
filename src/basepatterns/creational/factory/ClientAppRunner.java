package basepatterns.creational.factory;

public class ClientAppRunner {
    public static void main(String[] args) {
        //it's just Factory pattern without using static method createTeacherFactoryBySpecialty:
        // for creating another type of teacher we have to change
        TeacherFactory teacherFactory = new MathTeacherFactory(); // only this line of code new SomeTeacherFactory
        Teacher teacher = teacherFactory.createTeacher();
        teacher.teach();

        // it's Factory pattern using static method createTeacherFactoryBySpecialty
        //for creating another type of teacher we have to change only argument
        // in createTeacherFactoryBySpecialty method
        TeacherFactory teacherFactory1 = createTeacherFactoryBySpecialty("math"); // here!
        // this two lines of code stay without changing
        Teacher teacher1 = teacherFactory1.createTeacher();
        teacher1.teach();

        TeacherFactory teacherFactory2 = createTeacherFactoryBySpecialty("chemistry");
        Teacher teacher2 = teacherFactory2.createTeacher();
        teacher2.teach();
    }

    static private TeacherFactory createTeacherFactoryBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("math")){
            return new MathTeacherFactory();
        } else if (specialty.equalsIgnoreCase("chemistry")){
            return new ChemistryTeacherFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");

        }
    }
}

/*  Math teacher teaches math
    Math teacher teaches math
    Chemistry teacher teaches chemistry
*/
