package basepatterns.creational.singleton;

public class ProgramLoggerRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("This is firrst info ");
        ProgramLogger.getProgramLogger().addLogInfo("This is second info ");
        ProgramLogger.getProgramLogger().addLogInfo("This is third info ");
        ProgramLogger.getProgramLogger().addLogInfo("This is forth info ");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}

/*
Some info for log file:
This is firrst info
This is second info
This is third info
This is forth info
*/
