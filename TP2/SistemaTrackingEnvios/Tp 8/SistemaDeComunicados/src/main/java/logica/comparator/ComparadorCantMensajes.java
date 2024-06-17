package logica.comparator;

import logica.receptor.Empleado;

import java.util.Comparator;

public class ComparadorCantMensajes implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getCantMensajes()-o2.getCantMensajes();
    }
}
