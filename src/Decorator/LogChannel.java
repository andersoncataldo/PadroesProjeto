package Decorator;

public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Registrando log de envio...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Registrando log de recebimento...");
        return super.receive();
    }
}