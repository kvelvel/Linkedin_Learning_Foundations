package com.katiavelasquez.linkedinlearning.basics.tableroBingo;

import java.util.ArrayList;
import java.util.List;

public class  Tablero {
    private List<ColumnaBingo> columnas = new ArrayList<>();

    public Tablero(){
        for(LetraBingo letra: LetraBingo.values()){
            columnas.add((new ColumnaBingo(letra)));
        }
    }

    @Override
    public String toString(){
        String tableroString = "";

        for (ColumnaBingo columna: columnas){
            tableroString += columna.toString() + "\n";
        }
        return tableroString;
    }

}
