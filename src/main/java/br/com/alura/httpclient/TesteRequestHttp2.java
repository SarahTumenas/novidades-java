package br.com.alura.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteRequestHttp2 {

    // Novidades do Java 11 - HTTP/2 Client API

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://www.casadocodigo.com.br")).GET().build();
        HttpResponse <String> resp = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(resp.statusCode());
        System.out.println(resp.body());
        System.out.println(resp.version());


    }
}
