package br.com.alura.fluxoreativo;

import java.time.LocalDate;
import java.util.concurrent.SubmissionPublisher;

public class Main {
    public static void main(String[] args) {
        //essa é uma forma de paralelizar, poderiamos usar a classe Thread, mas
        //as notas fiscais serão enviadas de forma descontrolada e poderá sobrecarregar o webservice que as processa

        NotaFiscal notaFiscal = new NotaFiscal("Arthur", 10, LocalDate.now());
        NotaFiscalClient notaFiscalClient = new NotaFiscalClient();

        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
        publisher.consume(notaFiscalClient::envia);
        publisher.submit(notaFiscal);

        System.out.println("Você recebera a nota fiscal por email");

        publisher.close();
    }
}
