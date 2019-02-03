package basepatterns.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hello,Java!");
        printer.print();
    }

}

//-Step 1 : --------------------------------------------------
interface PrinterInterface {
    void print();
}

//-Step 2:  --------------------------------------------------
class Printer implements PrinterInterface{
    String value;

    public Printer(String value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.println(value);
    }
}

//-Step 3:  create decorator-----------------------------------
class QuoteDecorator implements PrinterInterface{
    PrinterInterface printerInterface;

    public QuoteDecorator(PrinterInterface printerInterface) {
        this.printerInterface = printerInterface;
    }

    @Override
    public void print() {
        printerInterface.print();
    }
}
