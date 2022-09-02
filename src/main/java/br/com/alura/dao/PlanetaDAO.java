package br.com.alura.dao;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class PlanetaDAO {

    public void listar() throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();

       /*CompletableFuture<HttpResponse<String>> send =*/
        httpClient.sendAsync(
                HttpRequest.newBuilder().uri(new URI("http://localhost:8080/planetas")).GET().build(),
                HttpResponse.BodyHandlers.ofString())
               .whenComplete((s, t) -> System.out.println(s.body()));

    }
}
