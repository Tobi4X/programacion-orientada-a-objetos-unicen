package Logic;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    //Atributos
    private int numero;
    private List<Episodio> listaEpisodios = new ArrayList<>();

    //Constructor
    public Temporada(int numero, Serie serie) {
        this.numero = numero;
        serie.agregarTemporada(this);
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Episodio> getListaEpisodios() {
        return listaEpisodios;
    }

    public void setListaEpisodios(List<Episodio> listaEpisodios) {
        this.listaEpisodios = listaEpisodios;
    }

    //Metodos
    public void agregarEpisodio(Episodio episodio){
        List listaEpisodios = this.getListaEpisodios();
        listaEpisodios.add(episodio);
    }

    public void eliminarEpisodio(Episodio episodio){
        List listaEpisodios = this.getListaEpisodios();
        listaEpisodios.remove(episodio);
    }

    public int cantidadDeEpisodios(){
        int cantidad = 0;
        for (Episodio episodio : this.getListaEpisodios()){
            cantidad += 1;
        }
        return cantidad;
    }

    public int cantidadDeVistos(){
        int cantidad = 0;
        for (Episodio episodio : this.getListaEpisodios()){
            if (episodio.visto()) cantidad += 1;
        }
        return cantidad;
    }

    public double promedioCalificaciones(){
        double calificacion = 0;
        for(Episodio episodio : this.getListaEpisodios()){
            if (episodio.visto()) calificacion += (episodio.getCalificacion());
        }
        return calificacion / this.cantidadDeVistos();
    }

    public Episodio episodio(int num){
        return this.getListaEpisodios().get(num-1);
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "numero=" + numero +
                ", listaEpisodios=" + listaEpisodios +
                '}';
    }
}
