package com.katiavelasquez.linkedinlearning.basics.boletoLoteria;

import java.util.*;

public class BoletoLoteriaLista {
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int CANTIDAD_NUMEROS = 5;

    public BoletoLoteriaLista() {
        System.out.println("pase a generar una instancia de la clase BoletoLoteria");
    }

    public static List<Integer> generarBoleto(){
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            int num = generarNumero();
            while (numeros.contains(num)){
                num = generarNumero();
            }
            numeros.add(num);
        }

        Collections.sort(numeros);
        return numeros;
    }

    private static int generarNumero(){
        int numero;

        numero = (int)(Math.random() * (MAX - MIN + 1)) + MIN;
        return numero;
    }
}
