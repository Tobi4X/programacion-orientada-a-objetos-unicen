package logica.filtros.filtrosmensajes.logicos.compuestos;

import logica.Mensaje;
import logica.filtros.filtrosmensajes.FilterMsg;

public class FilterMsgOr extends FilterMsgCompuesto {

    public FilterMsgOr(FilterMsg f1, FilterMsg f2) {
        super(f1, f2);
    }

    @Override
    public boolean find(Mensaje msg) {
        return filerOne.find(msg) || filerTwo.find(msg);
    }
}
