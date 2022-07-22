package br.com.alura.fluxoreativo;

import java.time.LocalDate;

public class NotaFiscal {
    String arthur;
    int valor;
    LocalDate data;
    public NotaFiscal(String arthur, int valor, LocalDate data) {
        this.arthur = arthur;
        this.valor = valor;
        this.data = data;
    }
}
