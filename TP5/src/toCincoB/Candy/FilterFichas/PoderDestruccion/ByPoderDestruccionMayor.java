package toCincoB.Candy.FilterFichas.PoderDestruccion;

import toCincoB.Candy.Fichas.Ficha;
import toCincoB.Candy.FilterFichas.FilterFicha;

public class ByPoderDestruccionMayor extends ByPoderDestruccionMenor {

    public ByPoderDestruccionMayor(int poderDestruccion) {
        super(poderDestruccion);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getPoderDeDestruccion() > poderDestruccion;
    }
}
