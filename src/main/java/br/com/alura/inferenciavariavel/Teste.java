package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	//Novidade do Java 10 -Infer�ncia de vari�vel
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "04813189");

		System.out.println(cpfPorNomes);
	}
}
