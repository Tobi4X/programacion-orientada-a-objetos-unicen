package logica.Cursos;

import logica.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Curso extends ElementoCurso {
    private Double notaMinima;
    private Double precio;
    private List<String> palabrasClave;

    public Curso(String nombre, Double notaMinima, Double precio) {
        super(nombre);
        this.notaMinima = notaMinima;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecio(Alumno alumno) {
        if(this.aprobo(alumno))
            return 0;
        return getPrecio();
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public boolean aprobo(Alumno alumno) {
        return alumno.getNota(this) >= notaMinima;
    }

    @Override
    public Curso getCursoMasCaro() {
        return this;
    }

    @Override
    public List<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }
}
