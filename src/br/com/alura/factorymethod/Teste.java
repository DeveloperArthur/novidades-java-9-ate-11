package br.com.alura.factorymethod;

import java.util.*;

public class Teste {
	//Factory Method java 9
	public static void main(String[] args) {
		/*ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);*/

		List<String> nomes = List.of("primeironome, segundonome");
		//nomes.add("outronome");

		System.out.println(nomes);

		Map.of("nome", "Arthur");
		Set.of("terceironome");
	}
}
