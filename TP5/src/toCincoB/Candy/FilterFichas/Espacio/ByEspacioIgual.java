package toCincoB.Candy.FilterFichas.Espacio;

import toCincoB.Candy.Fichas.Ficha;

public class ByEspacioIgual extends ByEspacioMenor {
    public ByEspacioIgual(int espacio) {
        super(espacio);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getEspacio() == espacio;
    }
}
