package tpCinco.supermercadoFiltros.Producto;

public class Producto {
    private String nombre;
    private String descripcion;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getImporteTotal() {
        return precio * cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto clonar(){
        return new Producto(nombre, descripcion, precio, cantidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                '\n' +
                "nombre='" + nombre + '\'' + '\n' +
                ", precio=" + precio + '\n' +
                ", cantidad=" + cantidad + '\n' +
                '}';
    }
}
