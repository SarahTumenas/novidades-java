package br.com.alura.switchexpression;

public class Teste {

	//Novidade do Java 14 - Switch Expressions
	public static void main(String[] args) {
		String nome = "Jo�o";
		switch (nome) {
		case "Renata" -> System.out.println("Acertou: " + nome);

		case "Jo�o" -> System.out.println("Acertou: " + nome);

		default -> System.out.println("Nenhum nome encontrado!!");

		}
	}
}
