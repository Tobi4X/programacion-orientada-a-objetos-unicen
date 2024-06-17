package logica.filtros.filtrosmensajes.logicos.compuestos;

import logica.filtros.filtrosmensajes.FilterMsg;

public abstract class FilterMsgCompuesto implements FilterMsg {
    protected FilterMsg filerOne;
    protected FilterMsg filerTwo;

    public FilterMsgCompuesto(FilterMsg f1, FilterMsg f2) {
        filerOne = f1;
        filerTwo = f2;
    }

}
