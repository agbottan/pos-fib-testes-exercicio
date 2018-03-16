package br.fib.tdd.bancoTest;

// import br.fib.tdd.banco.Salario;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.mockito.Mockito.*;
import br.fib.tdd.banco.dao.ContaCorrenteDao;
import br.fib.tdd.banco.modelo.ContaCorrente;
import static org.junit.Assert.assertEquals;

/*
-------------------------
	Caso 1
-------------------------

80 horas
$20 / hora
2 dependentes

Bruto:   $ 1700,00
Liquido: $ 1428,00


-------------------------
	Caso 2
-------------------------

-------------------------
	Caso 3
-------------------------
*/


public class BancoTest {

	@Test
	public void deveRetornarOValorDoSaldo(){

		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

		ContaCorrente c1 = new ContaCorrente();
		c1.setValor(100.0);

		ContaCorrente c2 = new ContaCorrente();
		c2.setValor(200.0);

		contas.add(c1);
		contas.add(c2);

		ContaCorrenteDao dao = mock(ContaCorrenteDao.class);
		when(dao.getContas()).thenReturn(contas);
		Banco banco = new Banco(dao);

		assertEquals(300.0, banco.getSaldoBanco(), 0.0001);
	}

}
