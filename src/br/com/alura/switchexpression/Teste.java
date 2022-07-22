package br.com.alura.switchexpression;

public class Teste {

	public static void main(String[] args) {
		String nome = "Arthur";
		switch (nome) {
			case "Renata": {
				System.out.println("Acertou: " + nome);
				break;
			}
			case "Arthur": {
				System.out.println("Acertou: " + nome);
				break;
			}
			default: {
				System.out.println("Nenhum nome encontrado!!");
			}
		}

		//----------------- java 14

		switch (nome) {
			case "Renata" -> System.out.println("Acertou: " + nome);
			case "Arthur" -> System.out.println("Acertou: " + nome);
			default -> System.out.println("Nenhum nome encontrado!!");
		}
	}
}
