 package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C, PI, t, u, x, y, z;		
		
		PI = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();		

		t = (A * C) / 2;
		u = PI * C * C;
		x = ((A + B) * C) / 2;
		y = B * B;
		z = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", t);
		System.out.printf("CIRCULO: %.3f%n", u);
		System.out.printf("TRAPEZIO: %.3f%n", x);
		System.out.printf("QUADRADO: %.3f%n", y);
		System.out.printf("RETANGULO: %.3f%n", z);
		
		sc.close();
	}

}
