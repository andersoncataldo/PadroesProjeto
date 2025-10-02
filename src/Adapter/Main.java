package Adapter;

public class Main {
    public static void main(String[] args) {
        ProjetorSamsung p1 = new ProjetorSamsung();
        ProjetorLg p2 = new ProjetorLg();

        ProjetorSamsungAdapter psa = new ProjetorSamsungAdapter(p1);
        ProjetorLgAdapter pla = new ProjetorLgAdapter(p2, 5);

        SistemaMultimidia sm = new SistemaMultimidia();
        sm.init(pla);
        sm.init(psa);
    }
}
