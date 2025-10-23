package FactoryMethod;

public class MySQLChannel implements Channel {
    public void getMessage() {
        System.out.println("Message from MySQL Factory.Channel");
    }
}
