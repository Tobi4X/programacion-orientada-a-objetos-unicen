package logica.filtros.filtrosmensajes.logicos;

import logica.Mensaje;
import logica.filtros.filtrosmensajes.FilterMsg;

public class FiltroMsgNot implements FilterMsg {
    FilterMsg filter;
    public FiltroMsgNot(FilterMsg filter) {
        this.filter = filter;
    }

    @Override
    public boolean find(Mensaje msg) {
        return !filter.find(msg);
    }
}
