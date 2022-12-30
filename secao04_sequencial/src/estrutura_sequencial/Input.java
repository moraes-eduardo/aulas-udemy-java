package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.printf("Você digitou: %s%n", x);
		
		int y;
		y = sc.nextInt();
		System.out.printf("Você digitou: %d%n", y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);	
		
		char w;
		w = sc.next().charAt(0);
		System.out.printf("Você digitou: %c%n", w);
		
		sc.close();
	}

}
