package com.gm.mundopc;

public class Raton extends DispositivoEntrada{

    private int idRaton;
    private int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada,marca);
        this.idRaton = ++contadorRatones;
    }  
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}'+" , "+super.toString();
    }
    
    
}
