package basepatterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger; // A static field containing its only instance
    private static String logFile = "Some info for log file: \n";

    public static synchronized ProgramLogger getProgramLogger(){ //A static factory method for obtaining the instance
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }


    private ProgramLogger() {  // A private constructor
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
