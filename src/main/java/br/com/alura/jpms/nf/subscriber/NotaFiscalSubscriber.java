package br.com.alura.jpms.nf.subscriber;

import br.com.alura.jpms.modelo.dominio.NotaFiscal;
import br.com.alura.jpms.nf.servico.NotaFiscalServico;

import java.util.concurrent.Flow;

public class NotaFiscalSubscriber implements Flow.Subscriber<NotaFiscal> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(NotaFiscal nf) {
        NotaFiscalServico.emitir(nf);
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Notas emitidas com sucesso!!");
    }
}
