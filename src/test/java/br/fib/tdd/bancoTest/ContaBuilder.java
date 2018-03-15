package br.fib.tdd.bancoTest;

import java.util.ArrayList;
import java.util.List;
import br.fib.tdd.banco.Conta;
import br.fib.tdd.banco.Usuario;

public class ContaBuilder {
    private List<Conta> contas;

    public ContaBuilder() {
        contas = new ArrayList<Conta>();
    }

    public ContaBuilder addConta(Conta conta, Usuario usuario) {
        conta.setUsuario(usuario);
        this.contas.add(conta);
        return this;
    }

    public List<Conta> constroi() {
        return this.contas;
    }
}
