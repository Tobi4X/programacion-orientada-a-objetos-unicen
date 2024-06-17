package logica.filtros.filtrosmensajes;

import logica.Mensaje;

public interface FilterMsg {
    boolean find(Mensaje msg);
}
