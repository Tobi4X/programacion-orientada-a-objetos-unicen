package logica.filtros;

import logica.territorios.Comarca;

public class CondicionNOT implements Condicion{
    private Condicion c1;
    public CondicionNOT(Condicion c1){
        this.c1 = c1;
    }
    public boolean cumple(Comarca c){
        return !c1.cumple(c);
    }
}
