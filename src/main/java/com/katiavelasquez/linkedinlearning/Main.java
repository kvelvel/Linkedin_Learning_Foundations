package com.katiavelasquez.linkedinlearning;

import com.katiavelasquez.linkedinlearning.basics.boletoLoteria.*;
import com.katiavelasquez.linkedinlearning.basics.boletoLoteriaClass.BoletoLoteriaClass;
import com.katiavelasquez.linkedinlearning.basics.sorteoNavidad.SorteoNavidad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main
{
    public static void main( String[] args )
    {
        BoletoLoteria boleto = new BoletoLoteria();
        int[] boletoGenerado = boleto.generarBoleto();
        BoletoLoteriaClass boletoClase = new BoletoLoteriaClass();

        BoletoLoteriaLista boletoLista = new BoletoLoteriaLista();
        List<Integer> boletoListaGenerado = boletoLista.generarBoleto();
        boletoClase.generarBoleto();

        System.out.println("Su boleto generado por array es el siguiente: " + Arrays.toString(boletoGenerado));
        System.out.println("Su boleto generado por Lista es el siguiente: " + boletoListaGenerado);
        System.out.println("Su boleto generado como clase es el siguiente: " + boletoClase.obtenerBoleto());
        System.out.println("Su numero de reintegro es el siguiente: " + boletoClase.obtenerNumeroReintegro());


        //sorteo de navidad

        SorteoNavidad sorteo = new SorteoNavidad();
        sorteo.sorteo();
        sorteo.printSorteoPorNumeros();
        System.out.println("==================");
        sorteo.printSorteoPorPremio();
    }
}
