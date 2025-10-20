package Builder;


public class PedidoBuilder implements Builder {
    private Pedido pedido;

    public PedidoBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        pedido = new Pedido();
    }

    @Override
    public void setCliente(String cliente) {
        pedido.setCliente(cliente);
    }

    @Override
    public void setEndereco(String endereco) {
        pedido.setEndereco(endereco);
    }

    @Override
    public void setFormaPagamento(String formaPagamento) {
        pedido.setFormaPagamento(formaPagamento);
    }

    public Pedido getResult() {
        return pedido;
    }
}