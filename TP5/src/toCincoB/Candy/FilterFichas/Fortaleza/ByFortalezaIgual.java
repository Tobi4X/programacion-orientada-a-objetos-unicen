package toCincoB.Candy.FilterFichas.Fortaleza;

import toCincoB.Candy.Fichas.Ficha;

public class ByFortalezaIgual extends ByFortalezaMenor {
    public ByFortalezaIgual(int fortaleza) {
        super(fortaleza);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getFortaleza() == fortaleza;
    }
}
