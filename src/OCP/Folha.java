package OCP;

import java.util.ArrayList;
import java.util.List;

public class Folha {
    private float saldo;
    private List<Pagamento> funcionarios;
    public Folha(){
        this.saldo = 0;
        this.funcionarios = new ArrayList<Pagamento>();
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void add(Pagamento pag){
        this.funcionarios.add(pag);
    }

    public void calcular(){
        for(Pagamento pag : this.funcionarios){
            this.saldo += pag.getSaldo();
        }
    }
}
