package logica.filtros;

import logica.territorios.Comarca;

public class CondicionHab implements Condicion{
    private int cantHab;
    public CondicionHab(int cantHab) {
        this.cantHab = cantHab;
    }
    public boolean cumple(Comarca c){
        return c.getCantHab() > cantHab;
    }
}
