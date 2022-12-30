package estrutura4_outros;

public class FuncoesString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG  ";	
		
		String s01 = original.toLowerCase(); //tudo minusculo
		String s02 = original.toUpperCase(); //tudo maisculo
		String s03 = original.trim(); //exclui espaços em branco
		String s04 = original.substring(2); // mantem do indice 2 em diante
		String s05 = original.substring(2, 9); // mantem apenas do indice 2 a 8
		String s06 = original.replace('a', 'x'); // troca 'a' por 'x'
		String s07 = original.replace("abc", "xy"); // troca 'abc' por 'xy'
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");		
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + j + "-");
		
		
	}

}
