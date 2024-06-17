package toCincoB.Candy.FilterFichas.PoderDestruccion;

import toCincoB.Candy.Fichas.Ficha;

public class ByPoderDestruccionIgual extends ByPoderDestruccionMenor{
    public ByPoderDestruccionIgual(int poderDestruccion) {
        super(poderDestruccion);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getPoderDeDestruccion() == poderDestruccion;
    }
}
