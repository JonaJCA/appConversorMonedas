package com.conversor.modelos;

import com.conversor.principal.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscaMoneda(String moneda_base, String moneda_target) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9f93a46712c6814f2ab7ed60/pair/"+moneda_base+"/"+moneda_target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception  e) {
            throw new RuntimeException("No se encontro la moneda");
        }
    }
}
