package toCincoB.Candy.Fichas;

public class Ficha {
    private String nombre;
    protected int fortaleza;
    protected int espacio;
    private int poderDeDestruccion;

    public Ficha(String nombre, int fortaleza, int espacio, int poderDeDestruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDeDestruccion = poderDeDestruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getPoderDeDestruccion() {
        return poderDeDestruccion;
    }

    public Ficha clonar(){
        return new Ficha(nombre, fortaleza, espacio, poderDeDestruccion);
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "nombre='" + nombre + '\'' +
                ", fortaleza=" + fortaleza +
                ", espacio=" + espacio +
                ", poderDeDestruccion=" + poderDeDestruccion +
                '}';
    }
}
