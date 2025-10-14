package Decorator;

public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Adicionando mensagem ao buffer...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Lendo mensagem do buffer...");
        return super.receive();
    }
}