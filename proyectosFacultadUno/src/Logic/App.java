package Logic;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Persona personaUno = new Persona("Tobias", "Jensen", "123", "personauno@gmail.com");
        Persona personaDos = new Persona("Pepe", "Alvarez", "456", "personados@gmail.com");
        Persona personaTres = new Persona("Tobi", "Jota", "789", "personatres@gmail.com");

        Agenda agendaUno = new Agenda(personaUno);

        List<Persona> personasReunionUno = new ArrayList<Persona>();

        personasReunionUno.add(personaDos);
        personasReunionUno.add(personaTres);

        List<Persona> personasReunionDos = new ArrayList<Persona>();
        personasReunionUno.add(personaTres);

        Reunion reunionUno = new Reunion(LocalDate.now(), LocalDate.now(), "Clase 1 de Objetos", "Tandil, Aula 4 Pab 3", personasReunionUno);

        System.out.println(agendaUno.toString());
    }
}