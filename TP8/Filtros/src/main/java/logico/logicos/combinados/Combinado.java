package logico.logicos.combinados;

import logico.Filtro;

public abstract class Combinado implements Filtro{
    protected Filtro f1;
    protected Filtro f2;

    public Combinado(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
}
