package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Mauricio");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Edu");
		list.add("Ednaldo");
		list.add("Everaldo");		
		list.add(2, "Marco"); // adicionar na posição informada
		
		System.out.println(list.size()); // tamanho lista
		
		System.out.println("---------------------");		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.remove("Anna");  // remover um item comparação
		list.remove(4);  // remover um item pela posição
		
		//função lambda com predicado
		list.removeIf(x -> x.charAt(0) == 'E'); // remover todos que começam pela primeira letra especificada
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("---------------------");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
		
		
	}
}