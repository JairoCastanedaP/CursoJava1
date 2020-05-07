package com.gm.mundopc;

public class Monitor{

    private int idMonitor;
    private String marca;
    private double tamaño;
    private int contadorMonitores;
    
    public Monitor(){
        idMonitor=++contadorMonitores;
    }
    public Monitor(String marca,double tamaño){
        this.marca=marca;
        this.tamaño=tamaño;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
}