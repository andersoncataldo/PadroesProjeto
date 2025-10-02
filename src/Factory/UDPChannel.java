package Factory;

public class UDPChannel implements Channel {
    public void getMessage() {
        System.out.println("Message from UDP Factory.Channel");
    }
}