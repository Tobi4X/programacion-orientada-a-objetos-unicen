package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.FiltrosProducto.FilterProducto;
import tpCinco.supermercadoFiltros.Producto.Producto;

public class ICondicional implements Impuesto{
    private FilterProducto filtro;
    private Impuesto impuesto;
    public ICondicional(FilterProducto f, Impuesto i) {
        filtro = f;
        impuesto = i;
    }

    @Override
    public double calcularImpuesto(Producto p){
        if (filtro.find(p)) return impuesto.calcularImpuesto(p);
        return 0;
    }

}
