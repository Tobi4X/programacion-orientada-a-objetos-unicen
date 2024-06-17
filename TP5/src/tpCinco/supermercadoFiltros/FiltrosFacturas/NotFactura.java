package tpCinco.supermercadoFiltros.FiltrosFacturas;

import tpCinco.supermercadoFiltros.Stock.Factura;

public class NotFactura implements FilterFactura{
    private FilterFactura filter;

    public NotFactura(FilterFactura filter) {
        this.filter = filter;
    }

    @Override
    public boolean find(Factura f) {
        return !filter.find(f);
    }

}
