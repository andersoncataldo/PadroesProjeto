package Visitor;

public class Bicicleta extends Carro{

    public Bicicleta(String modelo) {
        super(modelo);
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
