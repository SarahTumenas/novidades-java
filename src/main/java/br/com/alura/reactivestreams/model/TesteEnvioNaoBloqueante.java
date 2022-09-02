package br.com.alura.reactivestreams.model;

import br.com.alura.reactivestreams.wsclient.NotaFiscalClient;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {

    public static void main(String[] args) {

        NotaFiscal primeiraNotaFiscal = new NotaFiscal("Jo�o", 39.99, LocalDate.now());
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
        NotaFiscalClient nfwsc = new NotaFiscalClient();
        publisher.consume(nfwsc::enviar);
        publisher.submit(primeiraNotaFiscal);
        System.out.println("Voc� ir� receber a nota fiscal no seu e-mail");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();
        publisher.close();
    }
}
