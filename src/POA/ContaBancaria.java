package POA;

import java.lang.reflect.*;

class ContaBancaria implements ContaBancariaInterface {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public void transferir(ContaBancariaInterface destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}