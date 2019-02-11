package basepatterns.behavioral.state;

public class StateRunner  {
    public static void main(String[] args) {

        Station station = new BBCRadio1();
		Radio radio = new Radio();
		radio.setStation(station);

		for(int i=0; i<=10;i++){
			radio.play();
			radio.changeStation(); //changing state of our context(radio)
		}
    }
}
/*    BBC Radio1...
      BBC Radio2...
      BBC World Service ...
      Pause...
      BBC Radio1...
      BBC Radio2...
      BBC World Service ...
      Pause...
      BBC Radio1...
      BBC Radio2...
      BBC World Service ...*/
//--------------------State--------------------------
interface Station{
    void play();
}
//---------------------------------------------------
class BBCRadio1 implements Station{
    @Override
    public void play() {System.out.println("BBC Radio1...");
    }
}
//---------------------------------------------------
class BBCRadio2 implements Station{
    @Override
    public void play() {System.out.println("BBC Radio2...");
    }
}
//---------------------------------------------------
class BBCWorldService implements Station{
    @Override
    public void play() {System.out.println("BBC World Service ...");
    }
}
//--------------------------------------------------
class Pause implements Station{
    @Override
    public void play() {
        System.out.println("Pause...");
    }
}

//+++++++++++++++++++Context+++++++++++++++++++++++++
class Radio{
    private Station station;
    public void setStation(Station station) {
        this.station = station;
    }

    public void changeStation(){
        if(station instanceof BBCRadio1){
            setStation(new BBCRadio2());
        }
        else if(station instanceof BBCRadio2){
            setStation(new BBCWorldService());
        }
        else if(station instanceof BBCWorldService){
            setStation(new Pause());
        }
        else if(station instanceof Pause){
            setStation(new BBCRadio1());
        }

    }
    void play(){
        station.play();
    }
}