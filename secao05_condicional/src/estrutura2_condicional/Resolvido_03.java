package estrutura2_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < b) {
			System.out.printf("MENOR = %d%n", a);
		} else if (b < c){
			System.out.printf("MENOR = %d%n", b);
		} else {
			System.out.printf("MENOR = %d%n", c);
		}
		
		sc.close();

	}
}
