package tpCinco.supermercadoFiltros.Descuentos;

import tpCinco.supermercadoFiltros.Stock.Factura;

public class DescuentoPorcentual implements Descuento{
    private double porcentaje;

    public DescuentoPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getDescuento(Factura f){
        return f.calcularTotal() * (porcentaje/100);
    }

}
