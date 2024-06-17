package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class Facturado implements FilterProducto{
    private double facturado;

    public Facturado(double facturado) {
        this.facturado = facturado;
    }

    @Override
    public boolean find(Producto obj) {
        return obj.getImporteTotal() > this.facturado;
    }
}
