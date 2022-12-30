package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double largura, comprimento, valorMetro, area, preco;		
		
		largura = sc.nextDouble();
		sc.nextLine();
		comprimento = sc.nextDouble();
		sc.nextLine();
		valorMetro = sc.nextDouble();

		area = largura * comprimento;
		preco = area * valorMetro;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
