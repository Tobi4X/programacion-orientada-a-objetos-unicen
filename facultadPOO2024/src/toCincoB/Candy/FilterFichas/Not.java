package toCincoB.Candy.FilterFichas;

import toCincoB.Candy.Fichas.Ficha;

public class Not implements FilterFicha {
    FilterFicha filter;
    public Not(FilterFicha filter1) {
        this.filter = filter1;
    }

    public boolean find(Ficha ficha){
        return !filter.find(ficha);
    }
}
