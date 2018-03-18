package br.fib.tdd.salarioTest;

// Externos
import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Internos
import br.fib.tdd.salario.Salario;

/*
-------------------------------
	Caso 1 -> Sem descontos
-------------------------------

80 horas
$20 / hora
2 dependentes

Bruto:   $ 1700,00
INSS:	 $ ??,00
IR:		 $ ??,00
Liquido: $ 1428,00


-------------------------
	Caso 2
-------------------------

60 horas
$40 / hora
4 dependentes

Bruto:   $ ??,00

Liquido: $ ??,00


-------------------------
	Caso 3
-------------------------

60 horas
$40 / hora
4 dependentes

Bruto:   $ ??,00
Liquido: $ ??,00

*/

/*
calculaSalarioLiquido
calculaSalarioBruto
calculaDescontoIR
calculaDescontoINSS
*/

public class SalarioTest {
	
	Salario salario = new Salario(80, 20, 2);
	
	@Test
	public void deveCalcularSalarioLiquido(){

		assertEquals(1428, salario.calculaSalarioBruto(), 0.00001);
	}

}
