package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class AndProducto implements FilterProducto {
    private FilterProducto filterProducto1;
    private FilterProducto filterProducto2;

    public AndProducto(FilterProducto filterProducto1, FilterProducto filterProducto2) {
        this.filterProducto1 = filterProducto1;
        this.filterProducto2 = filterProducto2;
    }

    @Override
    public boolean find(Producto o) {
        return filterProducto1.find(o) & filterProducto2.find(o);
    }
}
