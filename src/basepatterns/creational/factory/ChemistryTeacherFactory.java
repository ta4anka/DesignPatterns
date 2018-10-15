package basepatterns.creational.factory;

public class ChemistryTeacherFactory implements TeacherFactory {
    @Override
    public Teacher createTeacher() {
        return new ChemistryTeacher();
    }
}
