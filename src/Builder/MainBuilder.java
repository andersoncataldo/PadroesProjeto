package Builder;

public class MainBuilder {
    public static void main(String[] args) {
        PedidoBuilder pedidoBuilder = new PedidoBuilder();
        Director director = new Director(pedidoBuilder);

        director.construirPedidoSimples();
        Pedido pedido1 = pedidoBuilder.getResult();
        System.out.println(pedido1);

        director.construirPedidoCompleto();
        Pedido pedido2 = pedidoBuilder.getResult();
        System.out.println(pedido2);
    }
}