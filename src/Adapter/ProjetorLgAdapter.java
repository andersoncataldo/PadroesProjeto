package Adapter;

public class ProjetorLgAdapter implements Projetor{
    private ProjetorLg pLg;
    public ProjetorLgAdapter(ProjetorLg pLg, int timer) {
        this.pLg = pLg;
    }

    public void liga() {
        pLg.enabled(0);
    }

}
