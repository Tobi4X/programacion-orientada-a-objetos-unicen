package toCincoB.Candy.FilterFichas.Fortaleza;

import toCincoB.Candy.Fichas.Ficha;

public class ByFortalezaMayor extends ByFortalezaMenor {

    public ByFortalezaMayor(int fortaleza) {
        super(fortaleza);
    }

    @Override
    public boolean find(Ficha f) {
        return f.getFortaleza() > this.fortaleza;
    }
}
