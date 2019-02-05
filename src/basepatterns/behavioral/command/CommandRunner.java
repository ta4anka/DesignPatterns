package basepatterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        Computer c = new Computer();
        User u = new User(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        u.startComputer();
        u.stopComputer();
        u.resetComputer();
    }
}

//Step1:================================================
interface Command{
    void execute();
}
//Step2:------------------Receiver-------------------------
class Computer{
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void reset(){
        System.out.println("Reset");
    }
}
//Step3:---------------ConcreteCommand for every method of class Computer-:
//---------------ConcreteCommand for start()------------------------
class StartCommand implements Command{
    Computer computer;
    public StartCommand(Computer computer) {this.computer = computer;}
    @Override
    public void execute() {
        computer.start();
    }
}
//---------------ConcreteCommand for  stop()------------------------
class StopCommand implements Command{
    Computer computer;
    public StopCommand(Computer computer) {this.computer = computer;}
    @Override
    public void execute() {
        computer.stop();
    }
}
//---------------ConcreteCommand reset()------------------------
class ResetCommand implements Command{
    Computer computer;
    public ResetCommand(Computer computer) {this.computer = computer;}
    @Override
    public void execute() {
        computer.reset();
    }
}
//Step4:-Invoker(can work only with Command and "doesn't know" about Computer)--------------------
class User{
    private Command start;
    private Command stop;
    private Command reset;
    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }
    public void startComputer(){
        start.execute();
    }
    public void stopComputer(){
        stop.execute();
    }
    public void resetComputer(){
        reset.execute();
    }
}
//------------------------------------------------------