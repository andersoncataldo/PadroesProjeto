package FactoryMethod;

public class MySQLConnection extends Connection {
    public Channel create(){
        return new MySQLChannel();
    }
}
