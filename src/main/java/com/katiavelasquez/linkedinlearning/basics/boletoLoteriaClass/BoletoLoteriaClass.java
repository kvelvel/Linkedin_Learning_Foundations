package com.katiavelasquez.linkedinlearning.basics.boletoLoteriaClass;

import java.util.*;

public class BoletoLoteriaClass {
    private static final int CANTIDAD_NUMEROS = 6;
    private List<Integer> boleto;
    private int numeroReintegro;
    private static final int MIN = 1;
    private static final int MAX = 50;

    public BoletoLoteriaClass() {
        this.boleto = new ArrayList<>();
        this.numeroReintegro = generarNumero();
    }

    public void generarBoleto(){
        System.out.println("soy el metodo de la clase");
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            int num = generarNumero();
            while (this.boleto.contains(num)){
                num = generarNumero();
            }
            this.boleto.add(num);
        }

        Collections.sort(this.boleto);
    }

    public String obtenerBoleto(){
        String boletoToString = toString();
        return boletoToString;
    }

    public int obtenerNumeroReintegro(){
        return this.numeroReintegro;
    }

    @Override
    public String toString(){
        return getBoletoFormatted();
    }

    private String getBoletoFormatted(){
        return ("El boleto generado es: " + this.boleto.toString() + " y el número de reintegro es: " + this.numeroReintegro);
    }

    private static int generarNumero(){
        int numero;

        numero = (int)(Math.random() * (MAX - MIN + 1)) + MIN;
        return numero;
    }
}
