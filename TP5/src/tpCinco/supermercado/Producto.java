package tpCinco.supermercado;

import tpCinco.supermercado.impuesto.Impuesto;

public class Producto {
    private String nombre;
    private double importe;
    private Impuesto impuesto;

    public Producto(String nombre, double importe) { //Consultar si pasandole un impuesto de parametro rompe el encapsulamiento
        this.nombre = nombre;
        this.importe = importe;
    }

    public double getImporte() {
        if(impuesto != null) return impuesto.aplicar(importe);
        else return importe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto.clonar();
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
