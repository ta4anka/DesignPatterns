package basepatterns.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hello,Java!"); // Hello,Java!
        printer.print();
        PrinterInterface printerWithDecor = new QuoteDecorator(new Printer("Hello,Java!")); // "Hello,Java!"
        printerWithDecor.print();
    }

}

//-Step 1 : --------------------------------------------------
interface PrinterInterface { // Component
    void print();
}

//-Step 2:  --------------------------------------------------
class Printer implements PrinterInterface{ // Concrete Component
    String value;

    public Printer(String value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(value);
    }
}



//-Step 3:  create decorator---and add new functionality-------
class QuoteDecorator implements PrinterInterface{ // Concrete Decorator
    PrinterInterface printerInterface; // component

    public QuoteDecorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }

    @Override
    public void print() {
        System.out.print("\""); //new functionality
        printerInterface.print();
        System.out.print("\""); //new functionality
    }
}
