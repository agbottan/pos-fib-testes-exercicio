package br.fib.tdd.bancoTest;

import static org.junit.Assert.assertEquals;
import br.fib.tdd.banco.Salario;
import org.junit.Test;

public class BancoTest {
	
	Salario salario = new Salario(); 
	
	@Test
	public void deveCalcularSalario(){
		
		/*
			Caso 1
			80 horas
			$20 / hora
			2 dependentes
			
				Bruto:   $ 1700,00
				Liquido: $ 1428,00
		*/
		assertEquals(1428, salario.calcular(80,20,2), 0.00001);
	}

}
