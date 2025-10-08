package OCP;

public class Estagio implements  Pagamento {
    private float bolsa;

    public Estagio(float bolsa) {
        this.bolsa = bolsa;
    }
    public float getSaldo() {
        return this.bolsa;
    }
}
