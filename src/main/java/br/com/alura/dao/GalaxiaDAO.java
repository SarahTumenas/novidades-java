package br.com.alura.dao;

import java.util.List;
import java.util.Map;

public class GalaxiaDAO {
    public void listar() {
        Map<String, List<String>> galaxias = Map.of("nome",
                List.of("A pequena Nuvem de Magalhães", "A galáxia de Andrômeda"));
        System.out.println("[" + galaxias + "]");
    }
}
