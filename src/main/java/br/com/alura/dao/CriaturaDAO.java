package br.com.alura.dao;

import java.util.List;
import java.util.Map;

public class CriaturaDAO {
    public void listar(){
        Map<String, List<String>> criaturas = Map.of("nome", List.of("Shewbacca, Yoda, Grogu"));
        System.out.println("[" + criaturas + "]");
    }
}
