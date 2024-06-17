package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.Producto.Producto;

import java.time.LocalDate;

public class IAnioPar implements Impuesto{
    private Impuesto impuesto;

    public IAnioPar(Impuesto impuesto){
        this.impuesto = impuesto;
    }

    @Override
    public double calcularImpuesto(Producto p){
        if((LocalDate.now().getYear() % 2) == 0) return impuesto.calcularImpuesto(p);
        return 0;
    }

}
