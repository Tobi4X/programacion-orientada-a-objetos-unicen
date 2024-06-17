package logico.logicos;

import filtros.FiltroSeguro;

public class Not implements FiltroSeguro{
    private FiltroSeguro ff;

    public Not(FiltroSeguro ff) {
        this.ff = ff;
    }

    @Override
    public boolean find(Object o) {
        return !(ff.find(o));
    }
}
