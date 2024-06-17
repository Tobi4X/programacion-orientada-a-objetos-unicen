package logica.filtros;

import logica.territorios.Comarca;

public class CondicionAnd implements Condicion{
    private Condicion c1,c2;
    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    public boolean cumple(Comarca c){
        return c1.cumple(c) && c2.cumple(c);
    }
}
