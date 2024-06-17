package filter.logicos;

import filter.Filtro;

public class Not implements Filtro {
    Filtro f;

    public Not(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean check(Object o) {
        return !f.check(o);
    }
}
