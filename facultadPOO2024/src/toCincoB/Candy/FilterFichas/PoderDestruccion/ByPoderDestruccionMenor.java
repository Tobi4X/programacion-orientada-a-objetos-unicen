package toCincoB.Candy.FilterFichas.PoderDestruccion;

import toCincoB.Candy.Fichas.Ficha;
import toCincoB.Candy.FilterFichas.FilterFicha;

public class ByPoderDestruccionMenor implements FilterFicha {
    protected int poderDestruccion;

    public ByPoderDestruccionMenor(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean find(Ficha f) {
        return f.getPoderDeDestruccion() < poderDestruccion;
    }
}
