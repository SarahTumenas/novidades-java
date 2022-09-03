package br.com.alura.reactivestreams;

import br.com.alura.reactivestreams.model.NotaFiscal;
import br.com.alura.reactivestreams.wsclient.NotaFiscaWSClient;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

public class NotaFiscalSubscriber  implements Subscriber <NotaFiscal> {

    private Flow.Subscription subscription;


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Chamando o onSubscribe!!");
        this.subscription = subscription;
        this.subscription.request(1);

    }

    @Override
    public void onNext (NotaFiscal notaFiscal){
        NotaFiscaWSClient nfwsc = new NotaFiscaWSClient();
        nfwsc.enviar(notaFiscal);
        this.subscription.request(1);

    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Todas as notas foram emitidas!!");

    }
}
