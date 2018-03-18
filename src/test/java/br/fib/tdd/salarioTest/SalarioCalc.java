package br.fib.tdd.salarioTest;

// Internos
import br.fib.tdd.salario.Salario;


public class SalarioCalc {

	public static void calcula(int horas, double valor, int dep) {

		Salario sal = new Salario(horas, valor, dep);

		System.out.println("Bruto\t"   	+ sal.calculaSalarioBruto());
		System.out.println("INSS\t" 	+ sal.calculaDescontoINSS());
		System.out.println("IR\t" 	   	+ sal.calculaDescontoIR());
		System.out.println("Líquido\t"	+ sal.calculaSalarioLiquido());
	}

	public static void main(String[] args){

		// Caso 1
		calcula(80, 20, 2);

		// Caso 2

		// Caso 3

		// Caso 4
	}
}
