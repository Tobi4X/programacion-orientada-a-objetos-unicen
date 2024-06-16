package logica;

import logica.territorios.ElementoTerritorio;

import java.util.Comparator;

public class ComparatorAlfabetico implements Comparator<ElementoTerritorio> {
    @Override
    public int compare(ElementoTerritorio o1, ElementoTerritorio o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
