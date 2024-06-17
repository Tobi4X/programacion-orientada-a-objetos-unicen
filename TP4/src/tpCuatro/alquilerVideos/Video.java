package tpCuatro.alquilerVideos;

public class Video {
    //Atributos
    private int id;
    private String titulo;
    private Boolean alquilado;

    //Constructor
    public Video(int id, String titulo, Boolean alquilado) {
        this.id = id;
        this.titulo = titulo;
        this.alquilado = alquilado;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getAlquilado() {
        return alquilado;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }
}
