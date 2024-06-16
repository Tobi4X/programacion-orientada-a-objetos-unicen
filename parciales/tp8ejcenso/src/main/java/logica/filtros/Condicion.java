package logica.filtros;

import logica.territorios.Comarca;

public interface Condicion {
    boolean cumple(Comarca comarca);
}
