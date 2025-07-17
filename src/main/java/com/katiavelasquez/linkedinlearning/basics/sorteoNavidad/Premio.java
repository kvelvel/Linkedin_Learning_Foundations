package com.katiavelasquez.linkedinlearning.basics.sorteoNavidad;

public enum Premio {
    GORDO(20000, 1),
    SEGUNDO(6250, 1),
    TERCERO(2500, 1),
    CUARTO(1000, 2),
    QUINTO(300, 8),
    PEDREA(5, 18);

    private int premioPorEuro;
    private int cantidadPremios;

    Premio(int premioPorEuro, int cantidadPremio){
        this.premioPorEuro = premioPorEuro;
        this.cantidadPremios = cantidadPremio;
    }

    public int getPremioPorEuro() {
        return premioPorEuro;
    }

    public int getCantidadPremios() {
        return cantidadPremios;
    }
}
