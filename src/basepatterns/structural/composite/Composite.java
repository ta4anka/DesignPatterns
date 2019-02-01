package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
List<Shape> components = new ArrayList<>(); // not "List<Shape> shapes" because it can keep not only
                                            // shapes but and another composite, for example.

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        for(Shape component: components){
            component.draw();
        }
    }
}
