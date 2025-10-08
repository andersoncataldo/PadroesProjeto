package Decorator;

public class ZipChannel extends ChannelDecorator {
	public ZipChannel(Channel c) {
		super(c);
	}
    public void send(String message) {
        String zipMessage = "ZIP(" + message + ")";
        super.channel.send(zipMessage);
    }
    public String receive() {
        String message = super.channel.receive();
        String unzipMessage = message.replace("ZIP(", "").replace(")", "");
        return unzipMessage;
    }
}
