package LSP;

public class Main {
    public static void main(String[] args) {

        System.out.println("Quadrado: ");
        FormaGeometrica q = new Quadrado(8);
        q.calcularArea();
        System.out.println("Círculo: ");
        FormaGeometrica c = new Circulo(4);
        c.calcularArea();
        System.out.println("Retangulo: ");
        FormaGeometrica r = new Retangulo(6, 3);
        r.calcularArea();

    }
}