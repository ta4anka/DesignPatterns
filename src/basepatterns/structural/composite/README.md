**The composite pattern** groups objects into hierarchical tree structures and allows working with
a single object(node) in the same way as with a group of objects(composite).
        
  **Some examples:**
Directories with folders, a tree with leaves and branches.

![pic](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/1200px-Composite_UML_class_diagram_%28fixed%29.svg.png)


    
In our example we have `interface Shape`, and every node(`Rectangle`,`Square`,`Triangle`) as same as `Composite`, implements 
this interface and its method `draw()`.
