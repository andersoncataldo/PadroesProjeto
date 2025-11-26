package POA;


interface ContaBancariaInterface {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(ContaBancariaInterface destino, double valor);
    double getSaldo();
    String getNumero();
    String getTitular();
}