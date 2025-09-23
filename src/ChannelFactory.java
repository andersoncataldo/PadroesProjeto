public class ChannelFactory {
    public static Channel create() {
        return new TCPChannel();
    }
}
