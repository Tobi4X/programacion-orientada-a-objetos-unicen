package logico.logicos.combinados;

import logico.Filtro;

public class Or extends Combinado {
    public Or(Filtro f1, Filtro f2) {
        super(f1, f2);
    }

    @Override
    public boolean find(Object o) {
        return f1.find(o) || f2.find(o);
    }
}
