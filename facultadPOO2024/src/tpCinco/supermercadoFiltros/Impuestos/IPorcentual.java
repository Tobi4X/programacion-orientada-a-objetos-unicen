package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class IPorcentual implements Impuesto {

    private double porcentual;

    public IPorcentual(double porcentual) {
        this.porcentual = porcentual;
    }

    @Override
    public double calcularImpuesto(Producto p){
        return p.getImporteTotal() * (porcentual / 100);
    }
}
