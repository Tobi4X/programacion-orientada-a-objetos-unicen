package tpCinco.supermercado.impuesto;

public class Impuesto {
    protected String nombre;
    protected double porcentaje;
    protected double montoFijo;

    public Impuesto(String nombre, Double porcentaje, double montoFijo){
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.montoFijo = montoFijo;
    }

    public double aplicar(double monto){
        System.out.println(this.toString());
        return this.aplicarFijo(monto * ((porcentaje/100)+1)); // preguntar si es hardco o podemos dejar esas constantes en codigo
    }

    public double aplicarFijo(double monto){
        return monto + montoFijo;
    }

    public Impuesto clonar() {
        return new Impuesto(this.nombre, this.porcentaje, this.montoFijo);
    }

    @Override
    public String toString() {
        return "Impuesto{" +
                "nombre='" + nombre + '\'' +
                ", porcentaje=" + porcentaje +
                ", montoFijo=" + montoFijo +
                '}';
    }
}
