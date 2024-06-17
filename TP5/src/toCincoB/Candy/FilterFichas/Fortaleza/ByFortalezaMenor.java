package toCincoB.Candy.FilterFichas.Fortaleza;

import toCincoB.Candy.Fichas.Ficha;
import toCincoB.Candy.FilterFichas.FilterFicha;

public class ByFortalezaMenor implements FilterFicha {
    protected int fortaleza;

    public ByFortalezaMenor(int espacio) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean find(Ficha f) {
        return f.getFortaleza() < fortaleza;
    }
}
