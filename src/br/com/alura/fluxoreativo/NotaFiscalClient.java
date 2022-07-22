package br.com.alura.fluxoreativo;

public class NotaFiscalClient {
    public void envia(NotaFiscal notaFiscal) {
        try {
            System.out.println("emitindo nota fiscal");
            Thread.sleep(5000);
            System.out.println("nota fiscal emitida");
            System.out.println("em nome de "+notaFiscal.arthur);
            System.out.println("valor de "+notaFiscal.valor);
            System.out.println("na data de "+notaFiscal.data);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
