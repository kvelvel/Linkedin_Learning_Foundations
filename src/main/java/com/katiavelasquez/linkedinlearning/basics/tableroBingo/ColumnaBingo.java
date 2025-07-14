package com.katiavelasquez.linkedinlearning.basics.tableroBingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnaBingo {
    private LetraBingo letra;
    private List<Integer> nums = new ArrayList<>();

    public ColumnaBingo(LetraBingo letra) {
        this.letra = letra;

        for (int i = 0; i < letra.getCantidad() ; i++) {
            int numero = generarNumero();
            while (nums.contains(numero)){
                numero = generarNumero();
            }
            nums.add(numero);
        }

    }

    public LetraBingo getLetra() {
        return letra;
    }

    public List<Integer> getNums() {
        return nums;
    }

    private int generarNumero(){
        int numero;

        numero = (int)(Math.random() * (letra.getMax() - letra.getMin() + 1)) + letra.getMin();
        return numero;
    }

    @Override
    public String toString(){
        String col = "";
        col += this.letra + " " + this.nums;
        return col;
    }
}
