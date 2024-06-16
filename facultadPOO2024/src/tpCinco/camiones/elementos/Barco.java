package tpCinco.camiones.elementos;

import tpCinco.camiones.Cola;

import java.util.ArrayList;
import java.util.List;

public class Barco extends Elemento {
    private static Cola barcosPendientes = new Cola();
    private int capacidad;

    public Barco(int capacidad) {
        this.capacidad = capacidad;
        barcosPendientes.agregar(this);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Elemento clonar(){
        return new Barco(capacidad);
    }

    public List<Barco> getBarcosPendientes() {
        List<Barco> barcosPendientes = new ArrayList<>();
        for (Elemento elemento : Barco.barcosPendientes.obtener()) {
            barcosPendientes.add((Barco) ((Barco) elemento).clonar());
        }
        return barcosPendientes;
    }

    public void cargar(){
        Barco.barcosPendientes.eliminar(this);
    }

    @Override
    public boolean comparar(Elemento elemento) {
        return ((Barco)elemento).getCapacidad() > this.capacidad;
    }
}
