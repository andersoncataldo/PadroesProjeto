package OCP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pagamento c1 = new Contrato(1000);
        Pagamento e1 = new Estagio(9999);
        Pagamento clt1 = new Estagio(6666);

        Folha f1 = new Folha();

        f1.add(clt1);
        f1.add(c1);

        f1.calcular();

        System.out.println("Saldo da folha de pagamento: "+f1.getSaldo());
    }
}