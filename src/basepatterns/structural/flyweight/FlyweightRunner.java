package basepatterns.structural.flyweight;
import java.util.*;

public class FlyweightRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random random = new Random();
        for(Shape shape : shapes){
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x,y);
        }
    }
}

/*      (3,19): it's square with side 10
        (38,3): it's circle with radius 5
        (22,46): it's circle with radius 5
        (90,51): it's point
        (25,18): it's square with side 10
        (75,41): it's circle with radius 5*/
//--------------------------Flyweight------------------------------------
interface Shape {
    void draw(int x, int y);
}
//-----------------------Point Flyweight-------------------------------------
class Point implements Shape {
    public void draw(int x, int y) {System.out.println("("+x+","+y+"): it's point ");}
}
//------------------------Cicrle Flyweight-----------------------------------------
class Circle implements Shape {
    int r = 5;
    public void draw(int x, int y) {System.out.println("("+x+","+y+"): it's circle with radius "+r);}
}
//-------------------Square Flyweight-------------------------------------
class Square implements Shape {
    int a=10;
    public void draw(int x, int y) {System.out.println("("+x+","+y+"): it's square with side "+a);}
}
//=============================================================================
class ShapeFactory{
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){

        Shape shape = shapes.get(shapeName);
        if(shape==null){
            switch(shapeName){
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
