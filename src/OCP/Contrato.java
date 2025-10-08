package OCP;

public class Contrato implements Pagamento {
    private float salario;

    public Contrato(float salario) {
        this.salario = salario;
    }
    public float getSaldo() {
        return this.salario;
    }
}
