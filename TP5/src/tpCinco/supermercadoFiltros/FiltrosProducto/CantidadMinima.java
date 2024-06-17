package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class CantidadMinima implements FilterProducto{
    private double porcentaje;
    private double minimo;

    public CantidadMinima(double porcentaje, double minimo) {
        this.porcentaje = porcentaje;
        this.minimo = minimo;
    }

    @Override
    public boolean find(Producto obj) {
        return obj.getCantidad() <= minimo * (porcentaje/100);
    }
}
