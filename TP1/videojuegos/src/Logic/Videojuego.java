package Logic;

public class Videojuego {

    private String codigo, titulo, consola, categoria;
    private int cantidadJugadores;

    public Videojuego() {
    }

    public Videojuego(String codigo, String titulo, String consola, String categoria, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.categoria = categoria;
        this.cantidadJugadores = cantidadJugadores;
    }
}
