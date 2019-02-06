package basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MediatorRunner {
    public static void main(String[] args) {
        User robert = new User("Betty the Waitress");
        User john = new User("Michael Sullivan, Jr.");

        robert.sendMessage("So what brings you guys to the middle of nowhere?");
        john.sendMessage("We're bank robbers.");

    }
}
/*Wed Feb 06 20:40:13 EET 2019 [Betty the Waitress] : So what brings you guys to the middle of nowhere?
 Wed Feb 06 20:40:13 EET 2019 [Michael Sullivan, Jr.] : We're bank robbers.*/
//-----------------mediator--------------------------------------------------------
class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
//---------------------------------------------------------------------------------
class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
//---------------------------------------------------------------------------