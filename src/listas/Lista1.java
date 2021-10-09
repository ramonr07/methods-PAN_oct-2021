package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista1 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Jo�o da Silva");
		lista.add("Antonio Souza");
		lista.add("L�cia Ferreira");
		lista.add("Marcelo");
		lista.remove("L�cia Ferreira");
		
		System.out.println(lista.size());
		lista.forEach(System.out::println);
		
		System.out.println("------------");
		List<Integer> itens = Arrays.asList(11,10,16,5,85);
		itens.stream().filter(i -> i > 16).forEach(System.out::println);
	}
 		
		
	
}
