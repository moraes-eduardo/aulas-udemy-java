package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");		
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");		
		funcionario.salario = sc.nextDouble();
		System.out.print("Taxas: ");		
		funcionario.taxas = sc.nextDouble();		
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario.nome + ", $ " + funcionario.salarioLiquido());
		
		System.out.println();
		System.out.print("Informe a porcentagem de aumento do salario: ");
		funcionario.porcentagem = sc.nextDouble();
		
		System.out.println();
		System.out.println("Novo salario: " + funcionario.nome + ", $ " + funcionario.aumentoSalario());
		
		sc.close();

	}

}
