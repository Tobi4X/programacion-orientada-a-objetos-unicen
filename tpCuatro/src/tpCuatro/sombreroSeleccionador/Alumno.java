package tpCuatro.sombreroSeleccionador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Alumno> familiares;
    private List<String> cualidades;
    private Casa casa;

    public Alumno() {
        familiares = new ArrayList<>();
        cualidades = new ArrayList<>();
    }

    public Alumno(String nombre){
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getFamiliares() {
        return familiares;
    }

    public List<String> getCualidades() {
        return cualidades;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        if (casa.esAceptado(this)){
            this.casa = casa;
            casa.addAlumno(this);
        }
    }

}
