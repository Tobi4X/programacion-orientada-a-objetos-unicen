package logica.territorios;

import logica.filtros.Condicion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comarca extends ElementoTerritorio {
    private double superficie;
    private int cantHab;
    private double montoTotalIngresos;
    public Comarca(String nombre, double superficie, int cantHab, double montoTotalIngresos){
        super(nombre);
        this.superficie = superficie;
        this.cantHab = cantHab;
        this.montoTotalIngresos = montoTotalIngresos;
    }
    public int getCantHab(){
        return cantHab;
    }
    public double getSuperficie(){
        return superficie;
    }
    public double getMontoTotalIngresos(){
        return montoTotalIngresos;
    }
    public ArrayList<ElementoTerritorio>buscar(Condicion cc, Comparator<ElementoTerritorio> comparator){
        if (cc.cumple(this)){
            ArrayList<ElementoTerritorio> l = new ArrayList<>();
            l.add(this);
            return l;
        }
        return new ArrayList<>();
    }

}
