package Builder;

public class Pedido {
    private String cliente;
    private String endereco;
    private String formaPagamento;

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", endereco='" + endereco + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}