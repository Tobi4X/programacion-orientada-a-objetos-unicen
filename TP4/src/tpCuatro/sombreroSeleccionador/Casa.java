package tpCuatro.sombreroSeleccionador;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String nombre;
    private List<String> cualidades;
    private List<Alumno> alumnos;
    private int cantidadMaxima;
    private List<Casa> enemigos;

    public Casa(){
        this.alumnos = new ArrayList<>();
        this.cualidades = new ArrayList<>();
        this.enemigos = new ArrayList<>();
    }

    public Casa(int cantidadMaxima, String nombre) {
        this();
        this.cantidadMaxima = cantidadMaxima;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getCualidades() {
        return cualidades;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void addAlumno (Alumno a) {
        alumnos.add(a);
    }

    public boolean esAceptado(Alumno a){
        boolean noEsEnemigo = true;
        if (this.enemigos.contains(a.getCasa())) noEsEnemigo = false;
        return (cualidades.containsAll(a.getCualidades())) && (alumnos.size() < cantidadMaxima) && noEsEnemigo;
    }

}
