package basepatterns.behavioral.observer;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ObserverRunner {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurements(20, 765);
        station.setMeasurements(-10, 740);

    }
}

/*
    This is from console: The weather has changed. Temperature = 20, Pressure  = 765.
    his is from console: The weather has changed. Temperature = -10, Pressure  = 740.
*/

//---------Observable---------------------------------------------------
interface Observed{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
//------------------------------------------------------------
class MeteoStation implements Observed{
  private int temperature;
  private int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int t, int p){
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for(Observer o: observers){
            o.handleEvent(temperature, pressure);
        }
    }
}
//+++++++++++++++++Observer++++++++++++++++++++++++++++++++++++++++++

interface Observer{
    void handleEvent(int temp, int pressure);
}

//------------------------------------------------------------

class ConsoleObserver implements Observer{
    public void handleEvent(int temp, int pressure) {
        System.out.println("This is from console: The weather has changed. Temperature = " + temp + "," +
                " Pressure  = " + pressure +".");
    }
}
//------------------------------------------------------------
class FileObserver implements Observer{
    public void handleEvent(int temp, int pressure) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "file.txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Writing to file.txt --> The weather has changed. Temperature = " + temp + "," +
                    " Pressure = " + pressure +".");
            pw.println();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}