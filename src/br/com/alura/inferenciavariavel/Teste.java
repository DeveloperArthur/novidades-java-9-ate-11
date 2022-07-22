package br.com.alura.inferenciavariavel;

import java.util.Arrays;
import java.util.HashMap;

public class Teste {

	//var só pode ser utilizado no contexto de métodos em variáveis locais - java 10
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Arthur", "04813189");

		System.out.println(cpfPorNomes);

		var lista = Arrays.asList(1,2,3);
		lista.forEach(l -> {
			System.out.println(l);
		});
	}
}
