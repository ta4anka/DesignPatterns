package basepatterns.creational.factory;

public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Math teacher teaches math");
    }
}
