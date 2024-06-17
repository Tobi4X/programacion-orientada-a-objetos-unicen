package logica.filtros;

import logica.territorios.Comarca;

public class CondicionDensidad implements Condicion{
    private double densidad;
    public CondicionDensidad(double d){
        this.densidad=d;
    }
    public boolean cumple(Comarca c){
        return c.getDensidad() > densidad;
    }

}
