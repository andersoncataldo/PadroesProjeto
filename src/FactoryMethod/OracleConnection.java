package FactoryMethod;

public class OracleConnection extends Connection{
    public Channel create(){
        return new OracleChannel();
    }
}
