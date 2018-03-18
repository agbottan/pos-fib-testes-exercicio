package br.fib.tdd.salarioTest;

// Internos
import br.fib.tdd.salario.Salario;


public class SalarioCalc {

<<<<<<< HEAD
	public static void calcula(int horas, double valor, int dep) {

		Salario sal = new Salario(horas, valor, dep);

		System.out.println("Bruto\t"   	+ sal.calculaSalarioBruto());
		System.out.println("INSS\t" 	+ sal.calculaDescontoINSS());
		System.out.println("IR\t" 	   	+ sal.calculaDescontoIR());
		System.out.println("Líquido\t"	+ sal.calculaSalarioLiquido());
=======
	public static void calcula(String titulo, int horas, double valor, int dep) {

		Salario sal = new Salario(horas, valor, dep);

		System.out.println("------------------------");
		System.out.println(titulo);
		System.out.println("------------------------");
		System.out.println("Bruto\t"   	+ sal.calculaSalarioBruto());
		System.out.println("INSS\t" 	+ sal.calculaDescontoINSS());
		System.out.println("IR\t" 		+ sal.calculaDescontoIR());
		System.out.println("Líquido\t"	+ sal.calculaSalarioLiquido());
		System.out.print("\n");
>>>>>>> Calcula
	}

	public static void main(String[] args){

		// Caso 1
<<<<<<< HEAD
		calcula(80, 20, 2);

		// Caso 2

		// Caso 3

		// Caso 4
=======
		calcula("CASO 1", 80, 20, 2);

		// Caso 2
		calcula("CASO 2", 80, 10, 3);

		// Caso 3
		calcula("CASO 3", 60, 15, 1);

		// Caso 4
		calcula("CASO 4", 60, 100, 4);
>>>>>>> Calcula
	}
}
