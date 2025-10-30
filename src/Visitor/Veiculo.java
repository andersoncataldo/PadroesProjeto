package Visitor;

public abstract class Veiculo {

    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public abstract void accept(Visitor v);
}
