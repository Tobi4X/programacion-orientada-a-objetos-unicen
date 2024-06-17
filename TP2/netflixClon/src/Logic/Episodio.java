package Logic;

public class Episodio {

    //Atributos
    private String titulo, descripcion;
    private boolean banderaVisto;
    private int calificacion;

    //Constructor
    public Episodio(String titulo, String descripcion, Temporada temporada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        banderaVisto = false;
        calificacion = -1;
        temporada.agregarEpisodio(this);
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getBanderaVisto() {
        return banderaVisto;
    }

    public void setBanderaVisto(boolean banderaVisto) {
        this.banderaVisto = banderaVisto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //Metodos
    public void verEpisodio(){
        this.setBanderaVisto(true);
    }

    public void calificar(int calificacion){
        if (calificacion >= 1 && calificacion <= 5) this.setCalificacion(calificacion);
        else System.out.println("Ingrese una Calificacion entre 1 y 5");
    }

    public boolean visto(){
        return this.getBanderaVisto();
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", banderaVisto=" + banderaVisto +
                ", calificacion=" + calificacion +
                '}';
    }
}
