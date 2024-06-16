package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class OrProducto implements FilterProducto {
    private FilterProducto filtro1;
    private FilterProducto filtro2;

    public OrProducto(FilterProducto f1, FilterProducto f2) {
        filtro1 = f1;
        filtro2 = f2;
    }

    @Override
    public boolean find(Producto p){
        return filtro1.find(p) || filtro2.find(p);
    }

}
