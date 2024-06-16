import filter.PreguntaFilter;
import filter.Respuesta;
import preguntas.Pregunta;

import java.util.*;

public class Formulario {
    private String nombre;
    private List<Pregunta> preguntas;

    public Formulario(String nombre) {
        this.nombre = nombre;
        this.preguntas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPreguntas(Pregunta... preguntas){
        Collections.addAll(this.preguntas, preguntas);
    }

    public void deletePreguntas(Pregunta... preguntas){
        for (Pregunta pregunta : preguntas) {
            this.preguntas.remove(pregunta);
        }
    }

    public List<Object> getHistorial(){
        List<Object> historial = new ArrayList<>();
        for (Pregunta pregunta : preguntas) {
            historial.add(pregunta.getHistorial());
        }
        return historial;
    }

    public List<Pregunta> getPreguntas() {
        return new ArrayList<>(preguntas);
    }

    public List<Pregunta> filtrarPreguntas(PreguntaFilter... pregunta) {
        List<Pregunta> filtrados = new ArrayList<>();
        for(Pregunta preg: this.preguntas){
            for (PreguntaFilter pf: pregunta){
                if(pf.check(preg)) filtrados.add(preg);
            }
        }
        return filtrados;
    }

    private List<Object> getHistorialPreguntas(List<Pregunta> pregunta){
        List<Object> hist = new ArrayList<>();
        for (Pregunta preg: preguntas){
            hist.add(preg.getHistorial());
        }
        return hist;
    }

    private double getCantDePersonas(Respuesta[] respuesta, List<Pregunta> preguntas) {
        int cantDePersonas = 0;
        for(Pregunta preg: preguntas){
            cantDePersonas += preg.getCantRespuestasObtenidasDe(respuesta);
        }
        return cantDePersonas;
    }

    //Supongo que los profes se ponen en verdugo no dan recu y por ende solo se puede responder una sola vez por persona
    public double getCantDePersonasQueRespondio(Respuesta... respuesta) {
        return getCantDePersonas(respuesta, this.preguntas);
    }

    public double getCantDePersonasQueRespondio(List<Pregunta>preguntas, Respuesta... respuestas) {
        return getCantDePersonas(respuestas, preguntas);
    }

    public double getPorcentajeDePersonasQueRespondio(Respuesta... respuesta) {
        return getCantDePersonas(respuesta, this.preguntas)/ getHistorial().size() * 100;
    }

    public double getPorcentajeDePersonasQueRespondio(List<Pregunta>preguntas, Respuesta... respuestas) {
        return getCantDePersonas(respuestas, preguntas) / getHistorialPreguntas(preguntas).size() * 100;
    }

}
