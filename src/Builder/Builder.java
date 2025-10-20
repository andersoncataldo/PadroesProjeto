package Builder;

public interface Builder {
    void reset();
    void setCliente(String cliente);
    void setEndereco(String endereco);
    void setFormaPagamento(String formaPagamento);
}