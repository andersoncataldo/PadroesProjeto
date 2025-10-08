package LSP;

public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        int area = this.lado*this.lado;
        System.out.println("A área é: "+area);
    }
}
