package tpCuatro.jardinPrivado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Planta {
    private static int idPlanta;
    private static List<Planta> coleccionPlantas = new ArrayList<Planta>();
    private int id;
    private String nombre, nombreCientifico, paisOrigen;
    private LocalDate fechaCompra;

    public Planta() {
        idPlanta ++;
        coleccionPlantas.add(this);
        id = idPlanta;
    }

    public Planta(String nombre, String nombreCientifico, String paisOrigen, LocalDate fechaCompra) {
        this();
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = fechaCompra;
    }

    public static int getIdPlanta() {return idPlanta;};
    public static List<Planta> getColeccionPlantas() {return coleccionPlantas;};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public static void imprimirPlantas(){
        for (Planta p : coleccionPlantas){
            System.out.println(p.toString());
        }
    }

    @Override
    public String toString() {
        return "Planta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
