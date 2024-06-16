package tpCuatro.sistemaCsComputacion.Trabajos;

import tpCuatro.sistemaCsComputacion.Evaluador;

import java.util.List;

public class Poster extends Trabajo {
    public Poster(int id) {
        super(id);
    }
    @Override
    public boolean evaluable(Evaluador e) {
        return this.temas.contains(e.getTemasquesabe());
    }
}
