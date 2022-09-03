package br.com.alura.reactivestreams;

import br.com.alura.reactivestreams.model.NotaFiscal;
import br.com.alura.reactivestreams.wsclient.NotaFiscaWSClient;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {

    public static void main(String[] args) {

        //System.out.println("A thread do TesteEnvioNaoBloqueante é: " + Thread.currentThread().getName());

        //ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);

        NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
        NotaFiscal segundaNotaFiscal = new NotaFiscal("Paula", 39.99, LocalDate.now());
        NotaFiscal terceiraNotaFiscal = new NotaFiscal("Pedro", 39.99, LocalDate.now());

        //SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>(newFixedThreadPool, 1);

        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
        //NotaFiscaWSClient nfwsc = new NotaFiscaWSClient();
        //publisher.consume(nfwsc::enviar);

        /*publisher.consume(data -> {
            System.out.println("Outra thread " + Thread.currentThread().getName());
        });
        publisher.consume(data -> {
            System.out.println("Mais uma thread " + Thread.currentThread().getName());
        });*/

        NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
        publisher.subscribe(subscriber);

        publisher.submit(primeiraNotaFiscal);
        publisher.submit(segundaNotaFiscal);
        publisher.submit(terceiraNotaFiscal);
        System.out.println("Você irá receber a nota fiscal no seu e-mail");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();

        publisher.close();
    }
}
