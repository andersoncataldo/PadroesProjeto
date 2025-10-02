package Singleton;

public class Main {
    public static void main(String[] args) {
        Logger lg = Logger.getInstance();
        lg.println("Meu primeiro log na Main");

        DBConn db = DBConn.getInstance();
        db.connect("Conectado com o banco de dados!");
    }
}
