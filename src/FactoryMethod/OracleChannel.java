package FactoryMethod;

public class OracleChannel implements Channel {
    public void getMessage() {
        System.out.println("Message from Oracle Factory.Channel");
    }
}
