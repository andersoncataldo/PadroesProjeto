package FactoryMethod;

public class PostgreSQLConnection extends Connection{
    public Channel create(){
        return new PostgreSQLChannel();
    }
}
