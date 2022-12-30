package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxas;
	public double porcentagem;
	
	public double salarioLiquido() {
		return salario - taxas;
	}
	
	public double aumentoSalario() {
		return salario += salario * porcentagem / 100.0;
	}
	
}
