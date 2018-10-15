package basepatterns.creational.factory;

public class ClientAppRunner {
    public static void main(String[] args) {
//        TeacherFactory teacherFactory = new MathTeacherFactory();
        TeacherFactory teacherFactory1 = createTeacherFactoryBySpecialty("math");
        TeacherFactory teacherFactory2 = createTeacherFactoryBySpecialty("chemistry");
        Teacher teacher1 = teacherFactory1.createTeacher();
        teacher1.teach();

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
