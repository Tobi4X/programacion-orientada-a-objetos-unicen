package tpCinco.supermercadoFiltros.FiltrosFacturas;

import tpCinco.supermercadoFiltros.Stock.Factura;

public class OrFactura implements FilterFactura{
    private FilterFactura f1;
    private FilterFactura f2;

    public OrFactura(FilterFactura f1, FilterFactura f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean find(Factura f){
        return f1.find(f) || f2.find(f);
    }
}
