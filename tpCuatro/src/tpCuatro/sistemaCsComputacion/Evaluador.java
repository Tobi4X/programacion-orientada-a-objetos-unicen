package tpCuatro.sistemaCsComputacion;

import tpCuatro.sistemaCsComputacion.Trabajos.Trabajo;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private int dni;
    private String nombre;
    private String apellido;
    private List<String>temasquesabe;
    private List<Trabajo> trabajosAsignados;

    public Evaluador(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.temasquesabe = new ArrayList<>();
        this.trabajosAsignados = new ArrayList<>();
    }
    public int getDni() {
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    public List<String> getTemasquesabe(){
        List<String> aux = new ArrayList<>();
        aux.addAll(this.temasquesabe);
        return aux;
    }

    public List<Trabajo> puedeReolver(List<Trabajo> t){
        List<Trabajo> aux = new ArrayList<>();
        for(Trabajo i : t){
            if(i.evaluable(this)) aux.add(i);
        }
        return aux;
    }

    public int cantidadTrabajosAsignados(){
        return this.trabajosAsignados.size();
    }


}
