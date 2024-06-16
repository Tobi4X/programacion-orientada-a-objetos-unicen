package toCincoB.Candy.FilterFichas.Espacio;

import toCincoB.Candy.Fichas.Ficha;
import toCincoB.Candy.FilterFichas.FilterFicha;

public class ByEspacioMenor implements FilterFicha {
    protected int espacio;

    public ByEspacioMenor(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean find(Ficha f) {
        return f.getEspacio() < espacio;
    }
}
