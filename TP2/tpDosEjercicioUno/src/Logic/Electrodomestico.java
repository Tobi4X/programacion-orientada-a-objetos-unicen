package Logic;

public class Electrodomestico {

    //Atributes
    private String nombre, color;
    private double precioBase, consumo, peso;

    //Constructor
    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        color = "Gris Plata";
        consumo = 10;
        precioBase = 100;
        peso = 2;
    }

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Methods
    public boolean bajoConsumo(){
        return getConsumo() < 45;
    }

    public double balance(){
        return this.precioBase / this.peso;
    }

    public boolean altaGama(){
        return this.balance() > 3;
    }
}
