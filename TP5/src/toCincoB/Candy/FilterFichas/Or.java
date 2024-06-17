package toCincoB.Candy.FilterFichas;

import toCincoB.Candy.Fichas.Ficha;

public class Or implements FilterFicha {
    FilterFicha filter1, filter2;
    public Or(FilterFicha filter1, FilterFicha filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    public boolean find(Ficha ficha){
        return filter1.find(ficha) || filter2.find(ficha);
    }
}
