package basepatterns.structural.composite;

public class CompositeAppRunner {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape rectangle1 = new Rectangle();
        Shape triangle1 = new Triangle();

        Shape square2 = new Square();
        Shape rectangle2 = new Rectangle();
        Shape triangle2 = new Triangle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2  = new Composite();



        composite1.addComponent(square1);
        composite1.addComponent(rectangle1);
        composite1.addComponent(triangle1);

        composite2.addComponent(square2);
        composite2.addComponent(rectangle2);
        composite2.addComponent(triangle2);



        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();


 /*       This is Square
        This is Rectangle
        This is Triangle
        This is Square
        This is Rectangle
        This is Triangle
*/

    }
}
