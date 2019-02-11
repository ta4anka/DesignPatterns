package basepatterns.behavioral.template;

public class TemplateRunner {
    public static void main(String[] args) {

        Template subClass1 = new SubClass1();
        subClass1.templateMethod();

        Template subClass2 = new SubClass2();
        subClass2.templateMethod();
    }
}
/*  The same 1 /This info only for SubClass1/ The same 3
    The same 1 /This info only for SubClass2/ The same 3
*/
//----------------------------------------------------------------
abstract class Template{

     public final void templateMethod(){
        System.out.print("The same 1");
         difference();
        System.out.println("The same 3");
        }

    public abstract void difference();
}
//----------------------------------------------------------------
class SubClass1 extends Template{
    @Override
    public void difference() {
        System.out.print(" /This info only for SubClass1/ ");
    }
}
//----------------------------------------------------------------
class SubClass2 extends Template{
    @Override
    public void difference() {
        System.out.print(" /This info only for SubClass2/ ");
    }
}