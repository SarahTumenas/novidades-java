package br.com.alura.jpms.modelo.dominio;

import java.util.List;

public class Livro {
    public Livro(String nome, String autor, Categoria... categorias) {
        this.nome = nome;
        this.autor = autor;
        this.categorias = List.of(categorias);
    }

    private String nome;
    private String autor;
    private List<Categoria> categorias;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\n" + nome + " - " + autor + " - " + categorias;
    }
}
