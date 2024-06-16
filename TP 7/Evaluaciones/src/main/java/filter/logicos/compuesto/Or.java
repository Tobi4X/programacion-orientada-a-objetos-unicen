package filter.logicos.compuesto;

import filter.Filtro;

public class Or extends Compuesto{

    public Or(Filtro f1, Filtro f2) {
        super(f1, f2);
    }

    @Override
    public boolean check(Object o) {
        return f1.check(o) || f2.check(o);
    }
}

