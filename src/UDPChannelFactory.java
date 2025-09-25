public class UDPChannelFactory extends ChannelFactory{
    public Channel create(){
        return new UDPChannel();
    }
}