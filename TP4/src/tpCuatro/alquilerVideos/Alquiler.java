package tpCuatro.alquilerVideos;

import java.time.LocalDate;
import java.util.List;

public class Alquiler {
    //Atributos
    private int id;
    private Cliente cliente;
    private List<Video> videosAlquilados;
    private int precio;
    private LocalDate fechaInicio, fechaFinal;


    //Constructores
    public Alquiler(int id, Cliente cliente, List<Video> videosAlquilados, int precio, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.id = id;
        this.cliente = cliente;
        this.videosAlquilados = videosAlquilados;
        this.precio = precio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    //Getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Video> getVideosAlquilados() {
        return videosAlquilados;
    }

    public int getPrecio() {
        return precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

}
