package basepatterns.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {
       /* Power power = new Power();
        power.on();
        DVDRom dvd = new DVDRom();
        dvd.load();
        HDD hdd = new HDD();
        hdd.copyFromDVD(dvd);*/

       Computer computer = new Computer();
       computer.copy();
       }
}

//---------Facade------------------------------------------------
class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
//---------------------------------------------------------------
class Power{
    public void on(){
        System.out.println("turn on");
    }
   public void off(){
        System.out.println("turn off");
    }
}
//---------------------------------------------------------------
class DVDRom{
    private boolean data = false;

    public boolean isData() {
        return data;
    }
    public void load(){
        data = true;
    }
    public void unload(){
        data = false;
    }
}
//---------------------------------------------------------------
class HDD {
    void copyFromDVD(DVDRom dvd){
        if(dvd.isData()){
            System.out.println("data is copying");
        }else{
            System.out.println("insert the disk into DVDRom");
        }
    }
}
//---------------------------------------------------------------

