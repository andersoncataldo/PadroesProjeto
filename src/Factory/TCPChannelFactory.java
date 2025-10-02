package Factory;

public class TCPChannelFactory extends ChannelFactory{
    public Channel create(){
        return new TCPChannel();
    }
}
