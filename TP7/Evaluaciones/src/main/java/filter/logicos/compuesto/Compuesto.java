package filter.logicos.compuesto;

import filter.Filtro;

public abstract class Compuesto implements Filtro {
    protected Filtro f1;
    protected Filtro f2;

    public Compuesto(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

}
