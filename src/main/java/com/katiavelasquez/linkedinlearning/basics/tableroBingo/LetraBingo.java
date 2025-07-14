package com.katiavelasquez.linkedinlearning.basics.tableroBingo;

public enum LetraBingo {
    B(1,15,5), I(16,30,5), N(31,45,4), G(46,60,5), O(61,75 ,5);
    private int min;
    private int max;
    private int cantidad;

    LetraBingo(int min,int max, int cantidad){
        this.min = min;
        this.max = max;
        this.cantidad = cantidad;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getLetra(){
        return this.name();
    }
}
