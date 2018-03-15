package br.aula.exercicios.salario;

import static org.junit.Assert.assertEquals;
import br.aula.exercicios.salario.Salario;
import org.junit.Test;

public class SalarioTest {
	
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
