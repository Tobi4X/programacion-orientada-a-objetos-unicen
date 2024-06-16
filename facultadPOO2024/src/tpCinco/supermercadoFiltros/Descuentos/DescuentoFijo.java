package tpCinco.supermercadoFiltros.Descuentos;

import tpCinco.supermercadoFiltros.Stock.Factura;

public class DescuentoFijo implements Descuento {
    private double monto;

    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double getDescuento(Factura f) {
        return monto;
    }
}
