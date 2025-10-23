package FactoryMethod;

public class PostgreSQLChannel implements Channel {
    public void getMessage() {
        System.out.println("Message from PostgreSQL Factory.Channel");
    }
}
