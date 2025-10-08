package Decorator;

public class ChannelDecorator implements Channel {
    protected Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }

    public void send(String message) {
        channel.send(message);
    }

    public String receive() {
        return channel.receive();
    }
}
