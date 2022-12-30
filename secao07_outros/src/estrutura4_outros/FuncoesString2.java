package estrutura4_outros;

public class FuncoesString2 {

	public static void main(String[] args) {

		String original = "potato apple lemon orange";
		
		String[] vect = original.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}
}