package br.com.alura.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class TesteDAO {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        new PlanetaDAO().listar();

        new CriaturaDAO().listar();

        new  GalaxiaDAO().listar();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }
}
