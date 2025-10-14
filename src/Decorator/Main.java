package Decorator;

public class Main {
    public static void main(String[] args) {
        Channel tcp = new TCPChannel();

        Channel secureChannel = new LogChannel(new ZipChannel(new BufferChannel(tcp)));

        secureChannel.send("Olá, mundo!");
        System.out.println(secureChannel.receive());
    }
}