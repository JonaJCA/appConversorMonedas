package com.conversor.modelos;

import com.conversor.principal.Moneda;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir (String moneda_base, String moneda_target, ConsultarMoneda moneda, Scanner lectura){
        double cantidad;
        double cantidad_convertida;

        Moneda monedas = moneda.buscaMoneda(moneda_base, moneda_target);
        System.out.println("La tasa para hoy de conversión es\n1 " + moneda_base + " = " + monedas.conversion_rate() + " " + moneda_target);
        System.out.println("Ingrese la cantidad de monedas " + moneda_base);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidad_convertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + moneda_base + " = " + cantidad_convertida + " " + monedas.target_code());
    }

    
}
