package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.Producto.Producto;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class IDomingo implements Impuesto{
    private Impuesto imp;

    public IDomingo(Impuesto imp) {
        this.imp = imp;
    }

    @Override
    public double calcularImpuesto(Producto p) {
        if(LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) return imp.calcularImpuesto(p);
        return 0;
    }
}
