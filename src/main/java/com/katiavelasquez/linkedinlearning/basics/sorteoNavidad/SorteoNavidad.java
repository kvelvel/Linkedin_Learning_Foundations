package com.katiavelasquez.linkedinlearning.basics.sorteoNavidad;

import java.util.*;

public class SorteoNavidad {
    //mínimo y máximo para los números del sorteo
    private static final int MIN_NUM_SORTEO = 0;
    private static final int MAX_NUM_SORTEO = 99999;
    private static final int DIG = (int) Math.floor(Math.log10(MAX_NUM_SORTEO)+1)   ;
    //variable para generar el número de forma random
    private static final Random R = new Random();

    private List<Integer> numerosSorteo = new ArrayList<>();
    private List<Premio> premios = new ArrayList<>();
    private Map<Integer, Premio> numeroPremio = new HashMap<>();


    public SorteoNavidad() {
        for (int i = MIN_NUM_SORTEO; i <= MAX_NUM_SORTEO ; i++) {
            numerosSorteo.add(i);
        }

        for (Premio premio: Premio.values()){
            for (int i = 0; i < premio.getCantidadPremios(); i++){
                premios.add(premio);
            }
        }
    }

    public void sorteo(){
        while (!premios.isEmpty()){
            int premioRandom = R.nextInt(premios.size());
            Premio premio = premios.remove(premioRandom);
            int numeroRandom = R.nextInt(numerosSorteo.size());
            int numeroSorteado = numerosSorteo.remove(numeroRandom);
            numeroPremio.put(numeroSorteado, premio);
        }
    }

    public void printSorteoPorNumeros(){
        System.out.println("Sorteo ordenado por numeros \n");
        if (numeroPremio.isEmpty()){
            System.out.println("Aun no se ha realizado el sorteo completo");
        }

        numeroPremio.keySet().stream().sorted().forEach(
                k-> System.out.println(formateoLinea(k,numeroPremio.get(k)))
        );
    }

    public void printSorteoPorPremio(){
        System.out.println("Sorteo ordenado por premios");
        if (numeroPremio.isEmpty()){
            System.out.println("Aun no se ha realizado el sorteo completo");
        }
        numeroPremio.entrySet().stream().sorted(
                new Comparator<Map.Entry<Integer, Premio>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Premio> o1, Map.Entry<Integer, Premio> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }
        ).forEach(
                e->System.out.println(formateoLinea(e))
        );
    }

    private String formateoLinea(int numero, Premio premio){
        return String.format("%0" + DIG + "d" , numero) + ": " + premio.getPremioPorEuro() + "€";
    }

    private String formateoLinea(Map.Entry<Integer, Premio> entry){
        return formateoLinea(entry.getKey(), entry.getValue());
    }
}
