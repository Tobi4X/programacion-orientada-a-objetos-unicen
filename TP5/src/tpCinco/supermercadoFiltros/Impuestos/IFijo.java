package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class IFijo implements Impuesto {
    private double fijo;

    public IFijo(double fijo) {
        this.fijo = fijo;
    }

    @Override
    public double calcularImpuesto(Producto p){
        return fijo;
    }
}
