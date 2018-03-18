package br.fib.tdd.salarioTest;

// Externos
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// Internos
import br.fib.tdd.salario.Salario;

/*
-------------------------
	Caso 1
-------------------------

80 horas
$20 / hora
2 dependentes

Bruto:   $ 1700,00
INSS:	 $ 153,00
IR:		 $ 119,00
Liquido: $ 1428,00


-------------------------
	Caso 2
-------------------------

80 horas
$10 / hora
3 dependentes

Bruto:	 $ 950,00
INSS:	 $ 80,75
IR:		 $ 47,50
Líquido: $ 821,75


-------------------------
	Caso 3
-------------------------

60 horas
$15 / hora
1 dependente

Bruto:	 $ 950,00
INSS:	 $ 80,75
IR:		 $ 47,50
Líquido: $ 821,75


-------------------------
	Caso 4
-------------------------

60 horas
$100 / hora
4 dependente

Bruto:	 $ 6200,00
INSS:	 $ 558,00
IR:		 $ 434,00
Líquido: $ 5208,00

*/

public class SalarioTest {
	
	private Salario salario1;
	private Salario salario2;
	private Salario salario3;
	private Salario salario4;

	@Before
    public void setUpTestes() {
    	/* Salario( horas mês, $ por hora, dependentes) */
		salario1 = new Salario(80, 20,  2);
		salario2 = new Salario(80, 10,  3);
		salario3 = new Salario(60, 15,  1);
		salario4 = new Salario(60, 100, 4);
    }
	
	// Teste para o método 'Salario.calculaSalarioBruto()'
	@Test
	public void deveCalcularSalarioBruto(){

		assertEquals( 1700.00, salario1.calculaSalarioBruto(), 0.00001);
		assertEquals(  950.00, salario2.calculaSalarioBruto(), 0.00001);
		assertEquals(  950.00, salario3.calculaSalarioBruto(), 0.00001);
		assertEquals( 6200.00, salario4.calculaSalarioBruto(), 0.00001);
	}

	// Teste para o método 'Salario.calculaDescontoINSS()'
	@Test
	public void deveCalcularDescontoINSS(){

		assertEquals( 153.00, salario1.calculaDescontoINSS(), 0.00001);
		assertEquals(  80.75, salario2.calculaDescontoINSS(), 0.00001);
		assertEquals(  80.75, salario3.calculaDescontoINSS(), 0.00001);
		assertEquals( 558.00, salario4.calculaDescontoINSS(), 0.00001);
	}

	// Teste para o método 'Salario.calculaDescontoIR()'
	@Test
	public void deveCalcularDescontoIR(){

		assertEquals( 119.00, salario1.calculaDescontoIR(), 0.00001);
		assertEquals(  47.50, salario2.calculaDescontoIR(), 0.00001);
		assertEquals(  47.50, salario3.calculaDescontoIR(), 0.00001);
		assertEquals( 434.00, salario4.calculaDescontoIR(), 0.00001);
	}

	// Teste para o método 'Salario.calculaSalarioLiquido()'
	@Test
	public void deveCalcularSalarioLiquido(){

		assertEquals( 1428.00, salario1.calculaSalarioLiquido(), 0.00001);
		assertEquals(  821.75, salario2.calculaSalarioLiquido(), 0.00001);
		assertEquals(  821.75, salario3.calculaSalarioLiquido(), 0.00001);
		assertEquals( 5208.00, salario4.calculaSalarioLiquido(), 0.00001);
	}
}
