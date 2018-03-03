package br.aula.exercicios.salario;

public class Salario {
	
	private double calcularBruto(int _horasTrabalhadas, double _salarioHora, int _quantidadeDependentes) {

		double totalBruto;
		
		totalBruto = _horasTrabalhadas * _salarioHora + (50 * _quantidadeDependentes);

		return totalBruto;
	}

	public double calcular(int _horasTrabalhadas, double _salarioHora, int _quantidadeDependentes) {
		
		double totalBruto = 0;
		double totalLiquido = 0;
		double descontoINSS = 0;
		double descontoIR = 0;
		
		totalBruto = calcularBruto(_horasTrabalhadas, _salarioHora, _quantidadeDependentes);
		
		descontoINSS = (totalBruto > 1000)? totalBruto * 9/100 : totalBruto * 8.5/100;
		
		if (totalBruto <= 500) {
			descontoIR = 0;
		} else if (totalBruto > 500 && totalBruto <= 1000) {
			descontoIR = totalBruto * 5/100;
		} else if (totalBruto > 1000) {
			descontoIR = totalBruto * 7/100;
		}
		
		totalLiquido = totalBruto - descontoINSS - descontoIR;

		return totalLiquido;
	}
}
