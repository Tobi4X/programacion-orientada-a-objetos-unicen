package tpCinco.supermercado;

public class Descuento {
    private String nombre;
    private double descuento;
    
    public Descuento(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }
    
    public double aplicar(double precio){
        return precio*descuento;
    }

    public Descuento clonar(){
        return new Descuento(this.nombre, this.descuento);
    }

    @Override
    public String toString() {
        return "Descuento{" +
                "nombre='" + nombre;
    }
}
