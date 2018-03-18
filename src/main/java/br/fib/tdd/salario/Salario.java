package br.fib.tdd.salario;

public class Salario {

	public int horasTrabalhadas;
	public double salarioHora;
	public int quantidadeDependentes;

	// CONSTRUCTOR
	public Salario(int _horasTrabalhadas, double _salarioHora, int _quantidadeDependentes) {

		horasTrabalhadas = _horasTrabalhadas;
		salarioHora = _salarioHora;
		quantidadeDependentes = _quantidadeDependentes;		
	}

	// SALÁRIO BRUTO
	public double calculaSalarioBruto() {
		
		double salarioBruto;
		salarioBruto = horasTrabalhadas * salarioHora + (50 * quantidadeDependentes);
		return salarioBruto;
	}

	// DESCONTO INSS
	public double calculaDescontoINSS() {
		
		double descontoINSS;
		double salarioBruto = calculaSalarioBruto();
		descontoINSS = (salarioBruto > 1000)? salarioBruto * 9/100 : salarioBruto * 8.5/100;
		return descontoINSS;
	}

	// DESCONTO IR
	public double calculaDescontoIR() {
		
		double salarioBruto = 0;
		double descontoIR = 0;

		salarioBruto = calculaSalarioBruto();

		if (salarioBruto <= 500) {
			descontoIR = 0;
		} else if (salarioBruto > 500 && salarioBruto <= 1000) {
			descontoIR = salarioBruto * 5/100;
		} else if (salarioBruto > 1000) {
			descontoIR = salarioBruto * 7/100;
		}

		return descontoIR;
	}

	// SALÁRIO LÍQUIDO
	public double calculaSalarioLiquido() {
		
		double salarioBruto   = 0;
		double salarioLiquido = 0;

		salarioBruto = calculaSalarioBruto();
		salarioLiquido = salarioBruto - calculaDescontoINSS() - calculaDescontoIR();

		return salarioLiquido;
	}
}
