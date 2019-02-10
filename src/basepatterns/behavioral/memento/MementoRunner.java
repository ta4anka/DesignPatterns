package basepatterns.behavioral.memento;

import java.util.Date;

public class MementoRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.set("Level1");
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        Thread.sleep(10000);

        game.set("Level2");
        System.out.println(game);


        System.out.println("Loading...");
        game.load(file.getSave());
        System.out.println(game);
    }
}

/*      Game [level = Level1, date = Sun Feb 10 21:30:01 EET 2019]
        Game [level = Level2, date = Sun Feb 10 21:30:11 EET 2019]
        Loading...
        Game [level = Level1, date = Sun Feb 10 21:30:01 EET 2019]
*/
//--------the originator------------------------------------------------------------------
class Game{
    private String level;
    private Date date;

    public void set(String level){
        this.level=level;
        this.date=new Date();
    }
    public void load(Save save){
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save(){
        return new Save(level);
    }
    @Override
    public String toString() {
        return "Game [level = " + level + ", date = " + date + "]";
    }
}
//-----------a memento---------------------------------------------------------------
class Save{
    private final String level;
    private final Date date;

    public Save(String level) {
        this.level = level;
        this.date = new Date();
    }
    public String getLevel() {
        return level;
    }
    public Date getDate() {
        return date;
    }
}

//-----a caretaker---------------------------------------------------------------------
class File{
    Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}

