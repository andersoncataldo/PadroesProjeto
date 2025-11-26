package POA;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCÁRIO COM POA EM JAVA ===");
        System.out.println("(Utilizando Princípio Proxy)\n");

        ContaBancariaInterface conta1 = AspectFactory.criarProxy(
                new ContaBancaria("001", "João Silva", 1000.0),
                ContaBancariaInterface.class
        );

        ContaBancariaInterface conta2 = AspectFactory.criarProxy(
                new ContaBancaria("002", "Maria Santos", 500.0),
                ContaBancariaInterface.class
        );

        try {
            System.out.println("\n>>> OPERAÇÃO 1: DEPÓSITO <<<");
            conta1.depositar(500.0);
            System.out.println("Novo saldo: R$ " + conta1.getSaldo());

            System.out.println("\n\n>>> OPERAÇÃO 2: SAQUE <<<");
            conta1.sacar(300.0);
            System.out.println("Novo saldo: R$ " + conta1.getSaldo());

            System.out.println("\n\n>>> OPERAÇÃO 3: TRANSFERÊNCIA <<<");
            conta1.transferir(conta2, 200.0);
            System.out.println("Saldo conta1: R$ " + conta1.getSaldo());
            System.out.println("Saldo conta2: R$ " + conta2.getSaldo());

            System.out.println("\n\n>>> OPERAÇÃO 4: TENTATIVA DE SAQUE INVÁLIDO <<<");
            conta2.sacar(10000.0);

        } catch (Exception e) {
            System.err.println("\n[SISTEMA] Erro capturado: " + e.getMessage());
        }

        System.out.println("\n\n=== SALDOS FINAIS ===");
        System.out.println("Conta 1 - " + conta1.getTitular() + ": R$ " + conta1.getSaldo());
        System.out.println("Conta 2 - " + conta2.getTitular() + ": R$ " + conta2.getSaldo());

        System.out.println("\n\n=== DEMONSTRAÇÃO: SEM ASPECTOS ===");
        ContaBancaria contaSemProxy = new ContaBancaria("003", "Pedro Costa", 1000.0);
        System.out.println("Depositando 100 sem aspectos...");
        contaSemProxy.depositar(100.0);
        System.out.println("Saldo: R$ " + contaSemProxy.getSaldo());
        System.out.println("(Observe que não há logs, auditoria, etc.)");
    }
}