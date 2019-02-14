package basepatterns.behavioral.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
/*    Displaying Keyboard.
      Displaying Monitor.
      Displaying Computer.*/

//--------Element----------------------------------------------------
interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

//--------ConcreteElement---------------------------------------------
class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
//--------ConcreteElement---------------------------------------------
class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
//--------ConcreteElement---------------------------------------------
class Computer implements ComputerPart {

    private ComputerPart[] parts;
    public Computer(){
        parts = new ComputerPart[]{new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

//=================================================================
//--------Visitor--------------------------------------------------
interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
//--------ConcreteVisitor------------------------------------------
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
//-----------------------------------------------------------------