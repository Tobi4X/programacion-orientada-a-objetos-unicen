package Logic;

import java.time.LocalDate;
import java.util.*;

public class Agenda {

    //Data
    private Persona owner;
    private List<Persona> listaContactos = new ArrayList<Persona>();
    private Map<LocalDate, Reunion> listaReuniones = new HashMap<LocalDate, Reunion>();

    //Constructor
    public Agenda(Persona owner) {
        this.owner = owner;
    }

    //Getters
    public Persona getOwner() {
        return owner;
    }

    public List<Persona> getListaContactos() {
        return listaContactos;
    }

    public Map<LocalDate, Reunion> getListaReuniones() {
        return listaReuniones;
    }

    //Methods


    @Override
    public String toString() {
        return "Agenda{" +
                "owner=" + owner +
                ", listaContactos=" + listaContactos +
                ", listaReuniones=" + listaReuniones +
                '}';
    }
}