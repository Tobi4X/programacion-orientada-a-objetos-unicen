package tpCinco.supermercadoFiltros.Impuestos;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class ICompuesto implements Impuesto {
    private Impuesto impuesto1;
    private Impuesto impuesto2;

    public ICompuesto(Impuesto impuesto1, Impuesto impuesto2) {
        this.impuesto1 = impuesto1;
        this.impuesto2 = impuesto2;
    }

    @Override
    public double calcularImpuesto(Producto p){
        return impuesto1.calcularImpuesto(p) + impuesto2.calcularImpuesto(p);
    }


}
