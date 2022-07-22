package br.com.alura.http.assincrono;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        planetas();
        animais();
        paises();
        times();

        //precisei colocar delay pra thread original nao matar o programa antes de mostrar planetas
        TimeUnit.MINUTES.sleep(1);
    }

    public static void planetas() throws URISyntaxException, IOException, InterruptedException {
        //o problema aqui é que vamos precisar esperar essa integracao para mostrar os outros grupos
        //sendo que nao precisamos seguir essa ordem, e isso esta trazendo lentidao ao codigo
        //ja que esse processamento nao depende dos outros, assim podemos utilizar chamada assincrona

        HttpClient httpClient = HttpClient.newBuilder().build();

        httpClient.sendAsync(
                HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/planetas"))
                    .GET()
                    .build(),
                HttpResponse.BodyHandlers.ofString()
        ).whenComplete((s, t) -> {
            System.out.println(s.body());
        });
    }

    public static void animais(){
        System.out.println("Animais: Macaco, elefante, urubu, morcego");
    }

    public static void paises(){
        System.out.println("Paises: Brasil, Argentina, EUA, Alemanha");
    }

    public static void times(){
        System.out.println("Times: corinthians, santos, palmeiras, bragantino");
    }
}
