package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Connection c = new MySQLConnection();
        Channel ch = c.create();
        ch.getMessage();

        Connection c2 = new OracleConnection();
        Channel ch2 = c2.create();
        ch2.getMessage();

        Connection c3 = new PostgreSQLConnection();
        Channel ch3 = c3.create();
        ch3.getMessage();
    }
}
