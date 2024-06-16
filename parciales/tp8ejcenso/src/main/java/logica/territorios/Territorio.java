package logica.territorios;

import logica.filtros.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Territorio extends ElementoTerritorio{
    List<ElementoTerritorio> subTerritorios;
    public Territorio (String nombre){
        super(nombre);
        this.subTerritorios = new ArrayList<ElementoTerritorio>();
    }

    public List<ElementoTerritorio> getSubTerritorios() {
        return new ArrayList<>(subTerritorios);
    }

    public int getCantHab(){
        int suma = 0;
        for (ElementoTerritorio elemento : subTerritorios){
            suma += elemento.getCantHab();
        }
        return suma;
    }
    public double getSuperficie(){
        double superficie = 0;
        for (ElementoTerritorio elemento : subTerritorios){
            superficie += elemento.getSuperficie();
        }
        return superficie;
    }

    @Override
    public double getMontoTotalIngresos() {
        double total = 0;
        for (ElementoTerritorio elemento : subTerritorios){
            total += elemento.getMontoTotalIngresos();
        }
        return total;
    }

    @Override
    public ArrayList<ElementoTerritorio> buscar(Condicion cc, Comparator<ElementoTerritorio> comparator) {
        ArrayList<ElementoTerritorio> aux = new ArrayList<>();
        for (ElementoTerritorio elemento : subTerritorios)
            aux.addAll(elemento.buscar(cc, comparator));
        aux.sort(comparator);
        return aux;
    }
}
