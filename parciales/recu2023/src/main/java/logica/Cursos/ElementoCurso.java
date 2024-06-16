package logica.Cursos;

import logica.Alumno;

import java.util.List;

public abstract class ElementoCurso {

    private String nombre;
    public ElementoCurso(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {return nombre;}
    public abstract double getPrecio();
    public abstract double getPrecio(Alumno alumno);
    public abstract int getCantidad();
    public abstract boolean aprobo(Alumno alumno);
    public abstract Curso getCursoMasCaro();
    public abstract List<String> getPalabrasClave();
}
