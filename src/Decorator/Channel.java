package Decorator;

public interface Channel {
    void send(String message);
    String receive();
}
