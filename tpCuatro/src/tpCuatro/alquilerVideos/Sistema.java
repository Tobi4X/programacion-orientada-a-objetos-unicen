package tpCuatro.alquilerVideos;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;
    private List<Video> videos;
    private List<Alquiler> alquileres;

    public Sistema() {
        this.clientes = new ArrayList<Cliente>();
        this.videos = new ArrayList<Video>();
        this.alquileres = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void agregarVideo(Video video) {
        this.videos.add(video);
    }

    public void agregarAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    public void eliminarCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void eliminarVideo(Video video) {
        this.videos.remove(video);
    }

    public void eliminarAlquiler(Alquiler alquiler) {
        this.alquileres.remove(alquiler);
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "clientes=" + clientes +
                ", videos=" + videos +
                ", alquileres=" + alquileres +
                '}';
    }
}
