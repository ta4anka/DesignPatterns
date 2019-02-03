package basepatterns.structural.decorator;


public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hello,Java!"); // Hello,Java!
        printer.print();

        PrinterInterface printerWithQuote = new QuoteDecorator(new Printer("Hello,Java!")); // "Hello,Java!"
        printerWithQuote.print();

        PrinterInterface printerWithBracket = new BracketDecorator(new Printer("Hello,Java!")); // {Hello,Java!}
        printerWithBracket.print();

        PrinterInterface printerWithTwoDecorators =
                new BracketDecorator(
                new QuoteDecorator(
                new Printer("Hello,Java!"))); // {"Hello,Java!"}
        printerWithTwoDecorators.print();
    }

}

//-Step 1 :Create an interface. --------------------------------------------------
interface PrinterInterface { // Component
    void print();
}

//-Step 2:  Create concrete classes implementing the same interface----------------
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


//-Step 3:----Create abstract decorator class implementing the PrinterInterface interface----
abstract class Decorator implements PrinterInterface{
    PrinterInterface printerInterface; // component

    public Decorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }


}

//-Step 4:  create concrete decorator---and add new functionality----------------------------

class QuoteDecorator extends Decorator{
    public QuoteDecorator(PrinterInterface printerInterface) {
        super(printerInterface);
    }
    public void print() {
        System.out.print("\""); //new functionality
        printerInterface.print();
        System.out.print("\""); //new functionality
    }
}

//-Step 5:  create another concrete decorator---and add new functionality--------------------

class BracketDecorator extends Decorator{

    public BracketDecorator(PrinterInterface printerInterface) {
        super(printerInterface);
    }

    public void print() {
        System.out.print('{'); //new functionality
        printerInterface.print();
        System.out.print('}'); //new functionality
    }
}