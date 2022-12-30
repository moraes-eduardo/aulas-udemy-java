package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		Double valor1, valor2, total;
		
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		sc.nextLine();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();	
		
		total = (double)(numero1 * valor1) + (numero2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		System.out.print(codigo1);
		System.out.print(codigo2);
		
		sc.close();
	}

}
