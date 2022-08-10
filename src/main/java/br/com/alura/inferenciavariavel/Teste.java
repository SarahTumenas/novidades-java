package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	//Novidade do Java 10 -Inferência de variável
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
	}
}
