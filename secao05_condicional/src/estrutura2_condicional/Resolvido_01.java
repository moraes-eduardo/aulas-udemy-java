package estrutura2_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		Double primeiroSemestre, segundoSemestre, notaFinal;
		
		primeiroSemestre = sc.nextDouble();
		sc.nextLine();
		segundoSemestre = sc.nextDouble();
		notaFinal = primeiroSemestre + segundoSemestre;

		if (notaFinal < 60) {
			System.out.printf("NOTA FINAL = %.2f%n", notaFinal);
			System.out.println("REPROVADO");
		} else {
			System.out.printf("NOTA FINAL = %.2f%n", notaFinal);		
		}
		
		sc.close();

	}
}
