package br.com.alura.factorymethod;

import java.util.*;

public class Teste {

	//Novidade Java 9 -Factory Method para Collection
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		System.out.println(nomes);
		//nomes.forEach(nome -> System.out.println(nome));
		Set.of("quartoNome");
		Map.of("nome", "José");



		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		*/
	}
}
