package com.katiavelasquez.linkedinlearning.basics.boletoLoteria;

import java.util.Arrays;

public class BoletoLoteria {
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int CANTIDAD_NUMEROS = 5;

    public BoletoLoteria() {
        System.out.println("pase a generar una instancia de la clase BoletoLoteria");
    }

    public static int[] generarBoleto(){
        int[] numeros = new int[CANTIDAD_NUMEROS];
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            numeros[i] = generarNumero();
        }

        Arrays.sort(numeros);
        return numeros;
    }

    private static int generarNumero(){
        int numero;

        numero = (int)(Math.random() * (MAX - MIN + 1)) + MIN;
        return numero;
    }
}
