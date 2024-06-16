package logica.territorios;

import logica.filtros.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoTerritorio {
    private String nombre;
    public ElementoTerritorio(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public abstract int getCantHab();
    public abstract double getSuperficie();
    public abstract double getMontoTotalIngresos();
    public abstract ArrayList<ElementoTerritorio> buscar(Condicion cc, Comparator<ElementoTerritorio> comparator);
    public double ingresoPerCapita(){
        return this.getMontoTotalIngresos() / this.getCantHab();
    }
    public double getDensidad(){
        return this.getCantHab()/this.getSuperficie();
    }


}
