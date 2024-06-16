package tpCinco.supermercadoFiltros.FiltrosFacturas;

import tpCinco.supermercadoFiltros.Stock.Factura;

import java.time.LocalDate;

public class FechaFactura implements FilterFactura{
    private LocalDate fecha;
    public FechaFactura(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean find(Factura f) {
        return fecha.equals(f.getFecha());
    }
}
