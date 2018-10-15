package basepatterns.creational.factory;

public class ChemistryTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Chemistry teacher teaches chemistry");
    }
}
