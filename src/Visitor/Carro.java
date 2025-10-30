package Visitor;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
