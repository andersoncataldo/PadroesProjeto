package Visitor;

public class Onibus extends Veiculo {

    public Onibus(String modelo) {
        super(modelo);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
