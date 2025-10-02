package Singleton;

public class DBConn {

    private DBConn() {}

    private static DBConn Instance;

    public static DBConn getInstance() {
        if (Instance == null) {
            Instance = new DBConn();
        }
        return Instance;
    }
    public void connect(String message) {
        System.out.println(message);
    }
}
