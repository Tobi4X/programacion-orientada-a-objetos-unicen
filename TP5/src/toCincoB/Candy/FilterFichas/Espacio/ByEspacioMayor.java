package toCincoB.Candy.FilterFichas.Espacio;

import toCincoB.Candy.Fichas.Ficha;

public class ByEspacioMayor extends ByEspacioMenor {

    public ByEspacioMayor(int espacio) {
        super(espacio);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getEspacio() > espacio;
    }
}
