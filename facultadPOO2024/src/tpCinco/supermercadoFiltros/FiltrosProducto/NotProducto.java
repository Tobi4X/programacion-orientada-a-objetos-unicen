package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class NotProducto implements FilterProducto {
    private FilterProducto filtro;

    public NotProducto(FilterProducto f){
        filtro = f;
    }

    @Override
    public boolean find(Producto p){
        return !filtro.find(p);
    }

}
