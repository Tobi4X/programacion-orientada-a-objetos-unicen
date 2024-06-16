package tpCinco.supermercadoFiltros.Producto;

import tpCinco.supermercadoFiltros.Impuestos.*;

public class ProductoConGravamen extends Producto{
    private Impuesto impuesto;

    public ProductoConGravamen(String nombre, String descripcion, double precio, int cantidad, Impuesto impuesto) {
        super(nombre, descripcion, precio, cantidad);
        this.impuesto = impuesto;
    }

    @Override
    public double getImporteTotal() {
        return super.getImporteTotal() + impuesto.calcularImpuesto(this);
    }

}
