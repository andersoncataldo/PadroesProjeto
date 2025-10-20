package Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construirPedidoSimples() {
        builder.reset();
        builder.setCliente("Cliente Simples");
        builder.setFormaPagamento("Dinheiro");
    }

    public void construirPedidoCompleto() {
        builder.reset();
        builder.setCliente("Cliente Premium");
        builder.setEndereco("Rua A, 123");
        builder.setFormaPagamento("Cartão de Crédito");
    }
}