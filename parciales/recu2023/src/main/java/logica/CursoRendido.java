package logica;

import logica.Cursos.ElementoCurso;

public class CursoRendido {
    private ElementoCurso curso;
    private double nota;

    public CursoRendido(ElementoCurso curso, double nota) {
        this.curso = curso;
        this.nota = nota;
    }

    public ElementoCurso getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }

}
