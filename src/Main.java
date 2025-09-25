public class Main {
    public static void main(String[] args) {
        ChannelFactory factory = new UDPChannelFactory();
        Channel ch = factory.create();
        ch.getMessage();

        ChannelFactory factory2 = new TCPChannelFactory();
        Channel ch2 = factory2.create();
        ch2.getMessage();
    }
}