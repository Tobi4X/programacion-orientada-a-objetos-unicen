package tpCinco.supermercadoFiltros.Stock;

import tpCinco.supermercadoFiltros.Descuentos.Descuento;
import tpCinco.supermercadoFiltros.Descuentos.DescuentoFijo;
import tpCinco.supermercadoFiltros.Producto.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Producto> productos;
    private LocalDate fecha;
    private Descuento descuento;

    private Factura(List<Producto> productos, LocalDate fecha, Descuento descuento) {
        this.productos = productos;
        this.fecha = fecha;
        this.descuento = descuento;
    }

    public Factura() {
        this.productos = new ArrayList<>();
        this.fecha = LocalDate.now();
        this.descuento = new DescuentoFijo(0);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double calcularTotal(){
        double montoTotal = 0;
        for (Producto producto : productos) {
            montoTotal += producto.getPrecio();
        }
        return montoTotal;
    }

    public double subTotal() {
        return this.calcularTotal() - descuento.getDescuento(this);
    }

    protected List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<>();
        for (Producto producto : this.productos) {
            productos.add(producto.clonar());
        }
        return productos;
    }

    protected Factura clonar(){
        return new Factura(productos, fecha, descuento);
    }

    @Override
    public String toString() {
        return "Factura{" +
                '\n' +
                ", Fecha=" + fecha + '\n' +
                ", Productos=" + productos + '\n' +
                ", Total=" + this.calcularTotal() + '\n' +
                ", Descuento=" + descuento.getDescuento(this) + '\n' +
                ", SubTotal=" + this.subTotal() +
                '}';
    }
}
