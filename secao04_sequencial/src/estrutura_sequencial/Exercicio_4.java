package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hora;
		Double valor, salario;
		
		
		numero = sc.nextInt();
		sc.nextLine();
		hora = sc.nextInt();
		sc.nextLine();
		valor = sc.nextDouble();
		sc.nextLine();
		
		salario = hora * valor;
		System.out.printf("NUMBER = %d%n", numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}

}
