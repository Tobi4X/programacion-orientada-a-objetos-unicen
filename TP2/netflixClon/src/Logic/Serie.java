package Logic;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    //Atributos
    private List<Temporada> listaTemporadas = new ArrayList();
    private String titulo, descripcion, creador, genero;

    public Serie(String titulo) {
        this.titulo = titulo;
    }

    //Getters y Setters
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }

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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos
    public void agregarTemporada(Temporada temporada){
        List listaEpisodios = this.getListaTemporadas();
        listaEpisodios.add(temporada);
    }

    public void eliminarTemporada(Temporada temporada){
        List listaEpisodios = this.getListaTemporadas();
        listaEpisodios.remove(temporada);
    }

    public int cantidadDeTemporadas(){
        int cantidad = 0;
        for (Temporada temporada : this.getListaTemporadas()){
            cantidad += 1;
        }
        return cantidad;
    }

    public int episodiosVistos(){
        int vistos = 0;
        for(Temporada temporada : this.getListaTemporadas()) {
            vistos += temporada.cantidadDeVistos();
        }
        return vistos;
    }

    public double promedioCalificaciones(){
        double promedio = 0;
        for(Temporada temporada : this.getListaTemporadas()) {
            promedio += temporada.promedioCalificaciones();
        }
        return promedio / this.cantidadDeTemporadas();
    }

    public boolean vioTodosLosEpisodios(){
        boolean bandera = true;
        for (Temporada temporada : getListaTemporadas()){
            if (temporada.cantidadDeEpisodios() != temporada.cantidadDeVistos()) bandera = false;
        }
        return bandera;
    }
    public Temporada temporada (int num){
        return this.getListaTemporadas().get(num-1);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "listaTemporadas=" + listaTemporadas +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creador='" + creador + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
