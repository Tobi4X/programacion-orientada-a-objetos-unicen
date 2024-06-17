package logica;

import logica.Cursos.Curso;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<CursoRendido> cursosRendidos;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cursosRendidos = new ArrayList<>();
    }

    public void addRendidos(CursoRendido... cursoRendido) {
        for (CursoRendido c : cursoRendido) {
            cursosRendidos.add(c);
        }
    }

    public void deleteRendidos(CursoRendido... cursoRendido) {
        for (CursoRendido c : cursoRendido) {
            cursosRendidos.remove(c);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<CursoRendido> getCursosRendidos() {
        return new ArrayList<>(cursosRendidos);
    }

    public double getNota(Curso curso) {
        for(CursoRendido c : cursosRendidos)
            if(c.getCurso().equals(curso))
                return c.getNota();
        return 0;
    }

}
