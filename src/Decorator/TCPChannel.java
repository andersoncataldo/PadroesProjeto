package Decorator;

import Decorator.Channel;

public class TCPChannel implements Channel {
    public void send(String message) {
        System.out.println("Sending message over TCP: " + message);
    }

    public String receive() {
        String message = "Received message over TCP";
        System.out.println(message);
        return message;
    }

}
