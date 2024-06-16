package logica.filtros;

import logica.territorios.Comarca;

public class CondicionNombre implements Condicion {
    private String nombre;
    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Comarca comarca) {
        return comarca.getNombre().equals(nombre);
    }
}
