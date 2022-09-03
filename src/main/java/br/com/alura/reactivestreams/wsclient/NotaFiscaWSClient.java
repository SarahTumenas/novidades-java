package br.com.alura.reactivestreams.wsclient;

import br.com.alura.reactivestreams.model.NotaFiscal;

public class NotaFiscaWSClient {

    public void enviar (NotaFiscal nf){
        try {
            System.out.println("Emitindo nota fiscal");
            Thread.sleep(5000);
            System.out.format("Nota fiscal emitida %nEm nome de %s %nNa data de %s %n,",
                    nf.getNome(), nf.getData());
            System.out.println("A thread do TesteEnvioNaoBloqueante é: " + Thread.currentThread().getName());
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
