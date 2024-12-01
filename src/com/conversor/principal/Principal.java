package com.conversor.principal;

import com.conversor.modelos.ConsultarMoneda;
import com.conversor.modelos.ConvertirMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda moneda = new ConsultarMoneda();

        int opcion=0;
        while (opcion!=7){
            System.out.println("************************************\n" +
                            "Bienvenidos a mi App Conversor de Monedas\n\n" +
                            "Ingresa el número para la conversión que deseas\n\n" +
                            "1. Dólar =>> Peso Argentino\n" +
                            "2. Peso Argentino =>> Dólar\n" +
                            "3. Dólar =>> Real Brasilero\n" +
                            "4. Real Brasilero =>> Dólar\n" +
                            "5. Dólar =>> Peso Colombiano\n" +
                            "6. Peso Colombiano =>> Dólar\n" +
                            "7. Salir\n" +
                            "Elija una opción válida\n" +
                            "************************************\n"
            );
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", moneda, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", moneda, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", moneda, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", moneda, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", moneda, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", moneda, lectura);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no Válida");
                    break;
            }
        }
    }
}
