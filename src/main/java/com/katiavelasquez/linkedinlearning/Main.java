package com.katiavelasquez.linkedinlearning;

import com.katiavelasquez.linkedinlearning.basics.boletoLoteria.BoletoLoteria;
import com.katiavelasquez.linkedinlearning.basics.boletoLoteria.BoletoLoteriaLista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        BoletoLoteria boleto = new BoletoLoteria();
        int[] boletoGenerado = boleto.generarBoleto();

        BoletoLoteriaLista boletoLista = new BoletoLoteriaLista();
        List<Integer> boletoListaGenerado = boletoLista.generarBoleto();

        System.out.println("Su boleto generado por array es el siguiente: " + Arrays.toString(boletoGenerado));
        System.out.println("Su boleto generado por Lista es el siguiente: " + boletoListaGenerado);
    }
}
