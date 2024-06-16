package tpCuatro.sistemaCsComputacion.Trabajos;

import tpCuatro.sistemaCsComputacion.Evaluador;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private int idtrabajo;
    protected List<String> temas;

    public Trabajo(int id) {
        this.idtrabajo = id;
        this.temas = new ArrayList<String>();
    }

    public boolean evaluable(Evaluador e){
        return this.temas.containsAll(e.getTemasquesabe());
    }

    public List<Evaluador> evaluablePor(List<Evaluador> l){
        List<Evaluador> res = new ArrayList<>();
        for(Evaluador i : l){
            if(this.evaluable(i)){
                res.add(i);
            }
        }
        return res;
    }
    public void addTemasgilarium(String falopa){
        this.temas.add(falopa);
    }

}
