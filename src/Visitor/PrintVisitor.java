package Visitor;

public class PrintVisitor implements Visitor {
    public void visit(Carro c){
        System.out.println("visitando entidade carro "+ c.getModelo());
    };
    public void visit(Onibus o){
        System.out.println("visitando entidade onibus "+ o.getModelo());
    };
    public void visit(Bicicleta b){
        System.out.println("visitando entidade bicicleta "+ b.getModelo());
    };
}