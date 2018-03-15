package br.fib.tdd.banco;

import java.util.List;
import br.banco.dao.ContaDao;
import br.banco.dominio.Conta;

public class Banco {
    private ContaDao dao;
    private List<Conta> contas;

    public Banco() {
        this.dao = new ContaDao();
        this.contas = dao.getContas();
    }

    public void atualizaJuros(double indice) {
        for (Conta c : this.contas) {
            double dividendo = c.getSaldo() + (indice * c.getSaldo() / 100);
            c.deposito(dividendo);
            this.dao.atualizaConta(c);
        }
    }

    public double totalSaldo() {
        double saldoTotal = 0.0;
        for (Conta c : this.contas) {
            saldoTotal += c.getSaldo();
        }
        return saldoTotal;
    }

    public List<Conta> getContas() {
        return contas;
    }
}