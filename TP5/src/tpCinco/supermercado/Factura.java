package tpCinco.supermercado;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Factura {

    private Descuento descuento;
    private Map<Producto, Integer> productos;
    private LocalDate fecha;

    public Factura() {
        this.productos = new HashMap<>();
        this.fecha = LocalDate.now();
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento.clonar();
    }

    public void agregarProducto(Producto producto, Integer cantidad) {
        if(!this.productos.containsKey(producto)) this.productos.put(producto, cantidad); // CONSULTAR si rompe encapsulamiento en caso de pasar el producto sin clonar
        else this.productos.put(producto, cantidad + this.productos.get(producto));
    }

    public double getMontoTotal() {
        double total = 0;
        for (Producto producto : this.productos.keySet()) {
            total += producto.getImporte();
        }
        return total;
    }

    public double getSubtotal(){
        if (this.descuento!= null )return descuento.aplicar(getMontoTotal());
        else return getMontoTotal();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "descuento=" + descuento +
                ", productos=" + productos +
                ", montoTotal=" + getMontoTotal() +
                ", subtotal=" + getSubtotal() +
                '}';
    }
}
