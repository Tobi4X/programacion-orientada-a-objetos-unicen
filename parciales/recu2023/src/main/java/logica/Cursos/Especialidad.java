package logica.Cursos;

import logica.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Especialidad extends ElementoCurso {

    private List<ElementoCurso> cursos;

    public Especialidad(String nombre) {
        super(nombre);
    }

    public void addCurso(ElementoCurso... c) {
        for (ElementoCurso e : c) {
            cursos.add(e);
        }
    }

    public void deleteCurso(ElementoCurso... c) {
        for (ElementoCurso e : c) {
            cursos.remove(e);
        }
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (ElementoCurso c : cursos) {
            precio += c.getPrecio();
        }
        return precio;
    }

    @Override
    public double getPrecio(Alumno alumno) {
        double precio = 0;
        for (ElementoCurso c : cursos) {
            precio += c.getPrecio(alumno);
        }
        return precio;
    }

    @Override
    public int getCantidad() {
        int cantidad = 0;
        for (ElementoCurso c : cursos) {
            cantidad += c.getCantidad();
        }
        return cantidad;
    }

    @Override
    public boolean aprobo(Alumno alumno) {
        boolean aprobo = true;
        for (ElementoCurso c : cursos) {
            aprobo &= c.aprobo(alumno);
        }
        return aprobo;
    }

    @Override
    public Curso getCursoMasCaro() {
        Curso c = new Curso("", 0.0, 0.0);
        for (ElementoCurso e : cursos){
            if (e.getCursoMasCaro().getPrecio() > c.getCursoMasCaro().getPrecio())
                c = e.getCursoMasCaro();
        }
        return c;
    }

    @Override
    public List<String> getPalabrasClave() {
        List<String> aux = new ArrayList<>();
        for (ElementoCurso e : cursos)
            for (String s : e.getPalabrasClave())
                if(!aux.contains(s))
                    aux.add(s);
        return aux;
    }
}
