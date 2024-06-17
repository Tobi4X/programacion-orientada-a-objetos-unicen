package Logic;

import java.time.LocalDate;
import java.util.*;

public class Reunion {

    //Data
    private LocalDate fInicio;
    private LocalDate fFinalizacion;
    private String temaTratar;
    private String lugar;
    private List<Persona> listaParticipantes = new ArrayList<Persona>();

    //Constructors
    public Reunion(LocalDate fInicio, LocalDate fFinalizacion, String temaTratar, String lugar, List<Persona> listaParticipantes) {
        this.fInicio = fInicio;
        this.fFinalizacion = fFinalizacion;
        this.temaTratar = temaTratar;
        this.lugar = lugar;
        this.listaParticipantes = listaParticipantes;
    }

    //Getters
    public LocalDate getfInicio() {
        return fInicio;
    }

    public LocalDate getfFinalizacion() {
        return fFinalizacion;
    }

    public String getTemaTratar() {
        return temaTratar;
    }

    public String getLugar() {
        return lugar;
    }

    public List<Persona> getListaParticipantes() {
        return listaParticipantes;
    }

    //Methods
}
