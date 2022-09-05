package br.com.alura.jpms.http.dao;

import br.com.alura.jpms.modelo.dominio.Categoria;
import br.com.alura.jpms.modelo.dominio.Livro;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LivroDAO {

    public List<Livro> listar() {
        String resposta = null;
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            resposta = httpClient
                    .send(HttpRequest.newBuilder().uri(new URI("https://turini.github.io/livro-java-9/books.csv")).GET()
                            .build(), HttpResponse.BodyHandlers.ofString())
                    .body();
        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        return Stream.of(resposta.split("\n")).map(LivroDAO::formatar).collect(Collectors.toList());
    }

    public static Livro formatar(String resposta) {
        String[] linhas = resposta.split(",");
        String nome = linhas[0];
        String autor = linhas[2];
        Categoria categoria = Categoria.valueOf(linhas[3]);
        return new Livro(nome, autor, categoria);
    }
}
