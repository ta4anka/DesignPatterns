package basepatterns.behavioral.strategy;

public class StrategyRunner  {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.setStation(new BBCRadio1());
        radio.play();

        radio.setStation(new BBCRadio2());
        radio.play();

        radio.setStation(new BBCWorldService());
        radio.play();

        radio.setStation(new Pause());
        radio.play();
        }
}
/*    BBC Radio1...
      BBC Radio2...
      BBC World Service ...
      Pause...
*/
//---------------Strategy------------------------------------
interface Station{
    void play();
}
//-----------------------------------------------------------
class BBCRadio1 implements Station{
    @Override
    public void play() {System.out.println("BBC Radio1...");
    }
}
//----------------------------------------------------------
class BBCRadio2 implements Station{
    @Override
    public void play() {System.out.println("BBC Radio2...");
    }
}
//----------------------------------------------------------
class BBCWorldService implements Station{
    @Override
    public void play() {System.out.println("BBC World Service ...");
    }
}
//----------------------------------------------------------
class Pause implements Station{
    @Override
    public void play() {
        System.out.println("Pause...");
    }
}

//+++++++++++++++++++Context+++++++++++++++++++++++++++++++++++
class Radio{
    private Station station;
    public void setStation(Station station) {
        this.station = station;
    }
    void play(){
        station.play();
    }
}