package Decorator;

import Decorator.Channel;

public class UDPChannel implements Channel {
    public void send(String message) {
        System.out.println("Sending via UDP: " + message);
    }

    public String receive() {
        String message = "Received message over UDP";
        System.out.println(message);
        return message;
    }
}
