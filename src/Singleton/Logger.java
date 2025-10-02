package Singleton;

public class Logger {

    private Logger() {}

    private static Logger Instance;

    public static Logger getInstance() {
        if (Instance == null) {
            Instance = new Logger();
        }
        return Instance;
    }
    public void println(String message) {
        System.out.println(message);
    }
}
