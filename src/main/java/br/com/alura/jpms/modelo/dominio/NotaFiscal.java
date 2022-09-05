package br.com.alura.jpms.modelo.dominio;

import java.time.LocalDate;

public class NotaFiscal {
    private String nome;
    private LocalDate data;
    private Double valor;

    public NotaFiscal(String nome) {
        this.nome = nome;
        this.data = LocalDate.now();
        this.valor = 39.99;
    }

    @Override
    public String toString() {
        return "Nota fiscal gerada no nome de " + nome + " dia " + data + " no valor de " + valor;
    }
}
