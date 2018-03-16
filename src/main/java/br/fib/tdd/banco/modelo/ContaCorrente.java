package br.fib.tdd.banco.modelo;

public class ContaCorrente {
    private Long id;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(Long id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoTotal() {
        return this.saldo;
    }
}
