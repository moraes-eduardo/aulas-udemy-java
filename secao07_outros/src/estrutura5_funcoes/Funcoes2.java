package estrutura5_funcoes;

import java.util.Scanner;

public class Funcoes2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
	
	// Função ou método que define o maior número
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}		
		return aux;		
	}
	
	// Imprimir na tela um valor
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}