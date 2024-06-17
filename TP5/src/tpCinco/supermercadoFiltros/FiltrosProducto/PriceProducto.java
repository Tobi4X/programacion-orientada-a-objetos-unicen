package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class PriceProducto implements FilterProducto {
    private double valor;

    public PriceProducto(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean find(Producto obj) {
        return obj.getPrecio() == valor;
    }
}
