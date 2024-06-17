package tpCinco.supermercadoFiltros.FiltrosProducto;

import tpCinco.supermercadoFiltros.Producto.Producto;

public class NameProducto implements FilterProducto {
    private String nombre;

    public NameProducto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean find(Producto p) {
        return nombre.equals(p.getNombre());
    }

}
