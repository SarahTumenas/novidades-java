package br.com.alura.jpms.nf.util;

import br.com.alura.jpms.modelo.dominio.NotaFiscal;
import br.com.alura.jpms.nf.subscriber.NotaFiscalSubscriber;

import java.util.concurrent.SubmissionPublisher;

public class NotaFiscalUtil {
    private SubmissionPublisher<NotaFiscal> publisher;

    public NotaFiscalUtil() {
        this.publisher = new SubmissionPublisher<NotaFiscal>();
        this.publisher.subscribe(new NotaFiscalSubscriber());
    }

    public void emitir(NotaFiscal nf) {
        this.publisher.submit(nf);
    }

    public void fechar() {
        this.publisher.close();
    }
}
