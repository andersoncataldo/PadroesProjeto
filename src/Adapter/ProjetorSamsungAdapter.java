package Adapter;

public class ProjetorSamsungAdapter implements Projetor {
    private ProjetorSamsung ps;

    public ProjetorSamsungAdapter(ProjetorSamsung ps) {
        this.ps = ps;
    }

    public void liga() {
        ps.turnOn();
    }
}
